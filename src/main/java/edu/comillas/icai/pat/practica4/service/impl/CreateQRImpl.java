/*******************************************************************************
 * Copyright (c) 2023 Universidad de Comillas ICAI.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the company
 * which accompanies this distribution
 *
 * Contributors:
 *     Universidad de Comillas - ICAI
 *******************************************************************************/


package edu.comillas.icai.pat.practica4.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import edu.comillas.icai.pat.practica4.service.CreateQRService;
import lombok.extern.slf4j.Slf4j;



@Service
@Slf4j
public class CreateQRImpl implements CreateQRService {
    @Autowired
    RestTemplate restTemplate;

    @Override
    public byte[] generarQR(String size, String data) throws Exception {
        try {
            String queryParams = "?size=" + size + "&data=" + data;
            String url = "https://api.qrserver.com/v1/create-qr-code/" + queryParams;

            log.info("Calling QR server API with URL: {}", url);
            ResponseEntity<byte[]> response = restTemplate.getForEntity(url, byte[].class);

            log.info("QR server API call successful with status code: {}", response.getStatusCode().value());
            return response.getBody();
        } catch (RestClientException e) {
            log.error("Error calling QR server API: {}", e.getMessage());
            throw new Exception("Error calling QR server API: " + e.getMessage());
        }
    }
}