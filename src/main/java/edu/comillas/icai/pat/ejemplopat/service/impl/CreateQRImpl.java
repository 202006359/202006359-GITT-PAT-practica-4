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

import org.springframework.stereotype.Service;

import edu.comillas.icai.pat.ejemplopat.service.CreateQRService;
 
 
 
 @Service
 public class CreateQRImpl implements CreateQRService {
 
     @Override
     public String generarQR(String size, String data) {
         
         String responseHealthCheck="Servicio OK! - "+data;
         return responseHealthCheck;
     }
 
 
 
 
     
 }
 