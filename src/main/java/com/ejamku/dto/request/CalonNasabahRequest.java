package com.ejamku.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalonNasabahRequest {

    String nik;
    String nama;
    String alamat;
    String kodePos;

}
