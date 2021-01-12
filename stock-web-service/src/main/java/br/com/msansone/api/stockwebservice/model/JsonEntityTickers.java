package br.com.msansone.api.stockwebservice.model;

import java.util.List;

public class JsonEntityTickers {
    private JEPagination pagination;
    private List<JEStockData> data;

    public JEPagination getPagination() {
        return pagination;
    }

    public void setPagination(JEPagination pagination) {
        this.pagination = pagination;
    }

    public List<JEStockData> getData() {
        return data;
    }

    public void setData(List<JEStockData> data) {
        this.data = data;
    }
}
