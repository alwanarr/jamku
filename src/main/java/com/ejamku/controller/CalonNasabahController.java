package com.ejamku.controller;


import com.ejamku.dto.response.CalonNasabahResponse;
import com.ejamku.model.CalonNasabah;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/calon")
public class CalonNasabahController {

    @Autowired
    private CalonNasabahResponse calonNasabahResponse;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/list/nasabah")
    public ResponseEntity getNasabah(Pageable pageable) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        String body = restTemplate
                .exchange("http://172.27.1.117:1717/pendash/ApiPen/getAllTblKrmCalon",
                        HttpMethod.GET, entity, String.class).getBody();
        Gson gson = new Gson();
        CalonNasabahResponse calonNasabahResponse = gson.fromJson(body, CalonNasabahResponse.class);
        List<CalonNasabah> data = calonNasabahResponse.getData();

        final int start = (int)pageable.getOffset();
        final int end = Math.min((start + pageable.getPageSize()), data.size());
        final Page<CalonNasabah> page = new PageImpl<>(data.subList(start, end), pageable, data.size());
        return ResponseEntity.ok().body(page);

    }

    @GetMapping("/akad")
    public ResponseEntity getAkad() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        String body = restTemplate
                .exchange("http://172.27.1.117:1717/pendash/ApiPen/getAllTblKrmAkad ",
                        HttpMethod.GET, entity, String.class).getBody();
        return ResponseEntity.ok().body(body);
    }

    @PostMapping("/search/{nik}")
    @ResponseBody
    public ResponseEntity<String> getSearchAkad (@PathVariable String nik) {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        String body = restTemplate
                .exchange("http://172.27.1.117:1717/pendash/ApiPen/SearchAllTblKrmCalon/" +nik,
                        HttpMethod.POST, entity, String.class).getBody();
        return ResponseEntity.ok().body(body);

    }

    @PostMapping("/search/{kodeBank}/{noRek}")
    @ResponseBody
    public ResponseEntity<String> getSearchKodeBank (@PathVariable String kodeBank, @PathVariable String noRek){

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        String body = restTemplate
                .exchange("http://172.27.1.117:1717/pendash/ApiPen/SearchAllTblKrmAkad/" +kodeBank+"/"+noRek ,
                HttpMethod.POST, entity, String.class).getBody();
        return ResponseEntity.ok().body(body);
    }
}
