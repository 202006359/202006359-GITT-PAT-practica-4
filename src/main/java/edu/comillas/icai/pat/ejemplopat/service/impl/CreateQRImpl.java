/*******************************************************************************
 * Copyright (c) 2023 Universidad de Comillas ICAI.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the company
 * which accompanies this distribution
 *
 * Contributors:
 *     Universidad de Comillas - ICAI
 *******************************************************************************/


package edu.comillas.icai.pat.ejemplopat.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import edu.comillas.icai.pat.ejemplopat.service.CreateQRService;
 
 
 
 @Service
 public class CreateQRImpl implements CreateQRService {
    @Autowired
    RestTemplate restTemplate;

     @Override
     public Object generarQR(String size, String data) {
         
 


        String queryParams = "?size=" + size + "&data=" + data;
        String url = "https://api.qrserver.com/v1/create-qr-code/" + queryParams;

        Object response = restTemplate.getForEntity(url,Object.class);

        return response;
     }
 
 
 
 
     
 }
 