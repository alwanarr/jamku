package com.ejamku.service;

import com.ejamku.dto.request.CalonNasabahRequest;
import com.ejamku.model.CalonNasabah;

import java.util.List;

public interface CalonNasabahService {

    List<CalonNasabah> getAll();
    CalonNasabah findById(Long id);
    CalonNasabah create(CalonNasabahRequest calonNasabahRequest);
    CalonNasabah update(CalonNasabahRequest calonNasabahRequest, Long id);
    void delete (Long id);
}
