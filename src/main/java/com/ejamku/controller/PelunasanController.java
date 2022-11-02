package com.ejamku.controller;

import com.ejamku.dto.request.PelunasanRequest;
import com.ejamku.dto.response.CalonNasabahResponse;
import com.ejamku.dto.response.PelunasanResponse;
import com.ejamku.model.Pelunasan;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/list")
public class PelunasanController {

    @Autowired
    private PelunasanResponse pelunasanResponse;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping ("/pelunasan")
    public ResponseEntity getPelunasan(@RequestBody PelunasanRequest request) throws JsonProcessingException {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        String resourceUrl
                = "http://172.27.1.117:1717/pendash/Sikp/getTblKrmPelunasan";

        PelunasanRequest pelunasanRequest = new PelunasanRequest();
        pelunasanRequest.setKode_bank("213");
        pelunasanRequest.setNomor_rekening("202206280111");
        // Create the request body by wrapping
        // the object in HttpEntity
        HttpEntity<PelunasanRequest> requestBody = new HttpEntity<PelunasanRequest>(request);

        // Send the PUT method as a method parameter
        ResponseEntity<String> response = restTemplate
                .postForEntity(resourceUrl, request, String.class);
        String body = response.getBody();

        Gson gson = new Gson();
        PelunasanResponse pelunasanResponse = gson.fromJson(body, PelunasanResponse.class);

//        List<Pelunasan> data = pelunasanResponse.getData();
//        ResponseEntity<String> response = restTemplate.
//                exchange("http://172.27.1.117:1717/pendash/Sikp/getTblKrmPelunasan",
//                HttpMethod.GET, httpEntity, String.class);

        return ResponseEntity.ok().body(pelunasanResponse);
    }

}
