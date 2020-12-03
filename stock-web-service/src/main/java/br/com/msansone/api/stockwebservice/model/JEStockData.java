package br.com.msansone.api.stockwebservice.model;

public class JEStockData {
    private String name;
    private String symbol;
    private String has_intraday;
    private String has_eod;
    private String country;
    private JEStockExchange stock_exchange;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getHas_intraday() {
        return has_intraday;
    }

    public void setHas_intraday(String has_intraday) {
        this.has_intraday = has_intraday;
    }

    public String getHas_eod() {
        return has_eod;
    }

    public void setHas_eod(String has_eod) {
        this.has_eod = has_eod;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public JEStockExchange getStock_exchange() {
        return stock_exchange;
    }

    public void setStock_exchange(JEStockExchange stock_exchange) {
        this.stock_exchange = stock_exchange;
    }
}
