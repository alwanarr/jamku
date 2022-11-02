package com.ejamku.dto.response;

import com.ejamku.model.Pelunasan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PelunasanResponse {

    private String code;
    private String error;
    private String message;
    private Pelunasan data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Pelunasan getData() {
        return data;
    }

    public void setData(Pelunasan data) {
        this.data = data;
    }
}
