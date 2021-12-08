package br.com.msansone.api.stockwebservice.ado;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Optional;
import java.util.logging.Logger;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

import br.com.msansone.api.stockwebservice.model.JEError;
import br.com.msansone.api.stockwebservice.model.JEStockValue;
import br.com.msansone.api.stockwebservice.model.JsonEntityEOD;
import br.com.msansone.api.stockwebservice.model.JsonEntityTickers;
import br.com.msansone.api.stockwebservice.model.StockWebInfoResponse;
import br.com.msansone.api.stockwebservice.model.StockWebValResponse;


public class MarketStackWebAccess implements IWebAccess {

    static String URI_EOD = "http://api.marketstack.com/v1/eod?access_key=018df0cc07569cd1813ad0926ee63f97&symbols=";
    static String URI_TICKERS = "http://api.marketstack.com/v1/tickers?access_key=018df0cc07569cd1813ad0926ee63f97&symbols=";

    private static Logger LOG = Logger.getLogger("getStockData");
    CloseableHttpClient httpClient = HttpClients.createDefault();


    @Override
    public StockWebInfoResponse getStockInfoData(String code) throws IOException {
        LOG.info("getStockInfoData(String code) : code="+code);

        StockWebInfoResponse retorno = new StockWebInfoResponse();

        code = code + ".BVMF";
        HttpGet request = new HttpGet(URI_TICKERS + code);
        CloseableHttpResponse response = httpClient.execute(request);
        HttpEntity entity = response.getEntity();

        String result = EntityUtils.toString(entity);

        Gson gson = new Gson();
        JsonEntityTickers tic = gson.fromJson(result, JsonEntityTickers.class);

        retorno.setCode(code);
        retorno.setName(tic.getData().get(0).getName());
        retorno.setStockExchangeAcronym(tic.getData().get(0).getStock_exchange().getAcronym());
        retorno.setStockExchangeContryCode(tic.getData().get(0).getStock_exchange().getCountry_code());
        retorno.setStockExchangeContry(tic.getData().get(0).getStock_exchange().getCountry());
        retorno.setStockExchangeName(tic.getData().get(0).getStock_exchange().getName());
        retorno.setStockExchangeMic(tic.getData().get(0).getStock_exchange().getMic());

        return retorno;
    }

    @Override
    public StockWebValResponse getStockValData(String code, LocalDate date) throws IOException {
    	LOG.info("getStockValData(String code, LocalDate date): code="+code+ ", date="+date);

        String result="";
        StockWebValResponse retorno = new StockWebValResponse();
        if (date==null) {
            date= LocalDate.now();
        }

        code = code + ".BVMF";
        HttpGet request = new HttpGet(URI_EOD + code);
        CloseableHttpResponse response = httpClient.execute(request);
        HttpEntity entity = response.getEntity();
        result = EntityUtils.toString(entity);

        Gson gson = new Gson();
        JsonEntityEOD tic = gson.fromJson(result, JsonEntityEOD.class);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        LocalDateTime agora = LocalDateTime.of(LocalDate.now(), LocalDateTime.MIN.toLocalTime());
        agora=agora.minusDays(1);

        String formattedDate = agora.format(formatter)+"+0000";

        Comparator<JEStockValue> comparator = Comparator.comparing(JEStockValue::getDate);
        
        Optional<JEStockValue> data=null;
        if (tic.getError()!=null){
            retorno.setError(
                    new JEError(tic.getError().getCode(),
                            tic.getError().getMessage()));
        } else {
            data = tic.getData()
                    .stream()
                    .max(comparator);

            if (data.isPresent()) {
                retorno.setValClose(data.get().getClose());
                retorno.setValHigh(data.get().getHigh());
                retorno.setValOpen(data.get().getOpen());
                retorno.setValLow(data.get().getLow());
                //LOG.info("minDate="+data.get().getDate());
                
                date = LocalDate.parse(dateFormater(data.get().getDate()));
            }
        }
        retorno.setCode(code);
        retorno.setDate(date);

        return retorno;
    }

	private String dateFormater(String data) {
		return data.replace("+0000", "").replace("T", " ").replace(" 00:00:00", "");
	}
}
