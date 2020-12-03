package br.com.msansone.api.stockwebservice.model;

import java.util.List;

public class JsonEntityEOD {

    private JEPagination pagination;
    private List<JEStockValue> data;
    private JEError error;

    public JEError getError() {
        return error;
    }

    public void setError(JEError error) {
        this.error = error;
    }

    public JEPagination getPagination() {
        return pagination;
    }

    public void setPagination(JEPagination pagination) {
        this.pagination = pagination;
    }

    public List<JEStockValue> getData() {
        return data;
    }

    public void setData(List<JEStockValue> data) {
        this.data = data;
    }
}
