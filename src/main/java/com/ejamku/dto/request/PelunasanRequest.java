package com.ejamku.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


public class PelunasanRequest {

    private String kode_bank;
    private String nomor_rekening;

    public String getKode_bank() {
        return kode_bank;
    }

    @JsonProperty("kode_bank")
    public void setKode_bank(String kode_bank) {
        this.kode_bank = kode_bank;
    }

    public String getNomor_rekening() {
        return nomor_rekening;
    }

    @JsonProperty("nomor_rekening")
    public void setNomor_rekening(String nomor_rekening) {
        this.nomor_rekening = nomor_rekening;
    }
}
