package com.ejamku.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pelunasan {
    private String id_kirim_pelunasan_dipercepat;
    private String kode_bank;
    private String nomor_rekening;
    private String nomor_surat_lunasdipercepat;
    private String tgl_surat_lunasdipercepat;
    private String keterangan;
    private String tgl_pelunasan;
    private String flag_kirim;
    private String waktu_kirim;
    private String from_jamsyar;
    private String respond;
    private String id_jamsyar;
    private String date_created;
    private String date_modified;
    private String response_code;
    private String response_message;

    public String getFrom_jamsyar() {
        return from_jamsyar;
    }

    public String getId_jamsyar() {
        return id_jamsyar;
    }

    public void setId_jamsyar(String id_jamsyar) {
        this.id_jamsyar = id_jamsyar;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getDate_modified() {
        return date_modified;
    }

    public void setDate_modified(String date_modified) {
        this.date_modified = date_modified;
    }

    public String getResponse_code() {
        return response_code;
    }

    public void setResponse_code(String response_code) {
        this.response_code = response_code;
    }

    public String getResponse_message() {
        return response_message;
    }

    public void setResponse_message(String response_message) {
        this.response_message = response_message;
    }

    @JsonProperty("from_jamsyar")
    public void setFrom_jamsyar(String from_jamsyar) {
        this.from_jamsyar = from_jamsyar;
    }

    public String getRespond() {
        return respond;
    }

    public void setRespond(String respond) {
        this.respond = respond;
    }

    public String getId_kirim_pelunasan_dipercepat() {
        return id_kirim_pelunasan_dipercepat;
    }

    public void setId_kirim_pelunasan_dipercepat(String id_kirim_pelunasan_dipercepat) {
        this.id_kirim_pelunasan_dipercepat = id_kirim_pelunasan_dipercepat;
    }

    public String getKode_bank() {
        return kode_bank;
    }

    public void setKode_bank(String kode_bank) {
        this.kode_bank = kode_bank;
    }

    public String getNomor_rekening() {
        return nomor_rekening;
    }

    public void setNomor_rekening(String nomor_rekening) {
        this.nomor_rekening = nomor_rekening;
    }

    public String getNomor_surat_lunasdipercepat() {
        return nomor_surat_lunasdipercepat;
    }

    public void setNomor_surat_lunasdipercepat(String nomor_surat_lunasdipercepat) {
        this.nomor_surat_lunasdipercepat = nomor_surat_lunasdipercepat;
    }

    public String getTgl_surat_lunasdipercepat() {
        return tgl_surat_lunasdipercepat;
    }

    public void setTgl_surat_lunasdipercepat(String tgl_surat_lunasdipercepat) {
        this.tgl_surat_lunasdipercepat = tgl_surat_lunasdipercepat;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getTgl_pelunasan() {
        return tgl_pelunasan;
    }

    public void setTgl_pelunasan(String tgl_pelunasan) {
        this.tgl_pelunasan = tgl_pelunasan;
    }

    public String getFlag_kirim() {
        return flag_kirim;
    }

    public void setFlag_kirim(String flag_kirim) {
        this.flag_kirim = flag_kirim;
    }

    public String getWaktu_kirim() {
        return waktu_kirim;
    }

    public void setWaktu_kirim(String waktu_kirim) {
        this.waktu_kirim = waktu_kirim;
    }
}
