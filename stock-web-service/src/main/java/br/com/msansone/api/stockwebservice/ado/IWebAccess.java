package br.com.msansone.api.stockwebservice.ado;

import br.com.msansone.api.stockwebservice.model.StockWebInfoResponse;
import br.com.msansone.api.stockwebservice.model.StockWebValResponse;

import java.io.IOException;
import java.time.LocalDate;

public interface IWebAccess {

    StockWebInfoResponse getStockInfoData(String code) throws IOException;
    StockWebValResponse getStockValData(String code, LocalDate date) throws IOException;

}
