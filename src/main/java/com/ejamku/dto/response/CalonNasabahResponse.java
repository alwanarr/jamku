package com.ejamku.dto.response;

import com.ejamku.model.CalonNasabah;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CalonNasabahResponse {

    private String Error;
    private List<CalonNasabah>data;

    public String getError() {
        return Error;
    }

    public void setError(String error) {
        Error = error;
    }

    public List<CalonNasabah> getData() {
        return data;
    }

    public void setData(List<CalonNasabah> data) {
        this.data = data;
    }
}
