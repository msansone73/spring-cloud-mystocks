package br.com.msansone.api.stockwebservice.service;

import java.io.IOException;
import java.math.BigDecimal;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class StockWebServiceImpl implements StockWebService {
	
	static String URI="https://www.fundsexplorer.com.br/funds/";

	@Override
	public BigDecimal getValue(String code) throws IOException {

		
		
		String value="0";
		Document doc = Jsoup.connect(URI+code).get();
		
        Elements elem = doc.getElementsByAttributeValue("class", "price");
        for (Element headline : elem) {
        	value=headline.html();
        }
		return toBigDecimal(value);
		
//		return new BigDecimal("23");
		
		
	}

	private BigDecimal toBigDecimal(String value) {
		return new BigDecimal(value
				.replace("R", "")
				.replace("$", "")
				.replace(",", ".")
				.replace(" ", ""));
	}

}
