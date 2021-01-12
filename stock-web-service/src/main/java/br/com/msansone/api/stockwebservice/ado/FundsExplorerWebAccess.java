package br.com.msansone.api.stockwebservice.ado;

import br.com.msansone.api.stockwebservice.model.StockWebInfoResponse;
import br.com.msansone.api.stockwebservice.model.StockWebValResponse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

public class FundsExplorerWebAccess implements IWebAccess {

    static String URI="https://www.fundsexplorer.com.br/funds/";

    @Override
    public StockWebInfoResponse getStockInfoData(String code) throws IOException {
        StockWebInfoResponse response= new StockWebInfoResponse();
        String value="0";
        Document doc = Jsoup.connect(URI+code).get();

        Elements elem = doc.getElementsByAttributeValue("class", "price");
        for (Element headline : elem) {
            value=headline.html();
        }

        response.setCode(code);
        return response;
    }

    @Override
    public StockWebValResponse getStockValData(String code, LocalDate date) throws IOException {
        return null;
    }

    private BigDecimal toBigDecimal(String value) {
        return new BigDecimal(value
                .replace("R", "")
                .replace("$", "")
                .replace(",", ".")
                .replace(" ", ""));
    }
}
