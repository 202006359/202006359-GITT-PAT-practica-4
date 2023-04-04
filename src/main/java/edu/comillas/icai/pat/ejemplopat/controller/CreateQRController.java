/*******************************************************************************
 * Copyright (c) 2023 Universidad de Comillas ICAI.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the company
 * which accompanies this distribution
 *
 * Contributors:
 *     Universidad de Comillas - ICAI
 *******************************************************************************/

 package edu.comillas.icai.pat.ejemplopat.controller;


 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.http.HttpStatus;
 import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestParam;
 import org.springframework.web.bind.annotation.RestController;
 
 import edu.comillas.icai.pat.ejemplopat.service.CreateQRService;
 
 
 @RestController
 @RequestMapping("/icai")
 public class CreateQRController {
 
     @Autowired
     CreateQRService qrService;
     
     //@CrossOrigin(origins = "http://127.0.0.1:5500/")
     @GetMapping("/CreateQR")
     public ResponseEntity<byte[]> loquequiera(@RequestParam(required = true) String size, @RequestParam(required = true) String data) {
         
         if (data == null) {
             data ="https://github.com/202006359";
         }
         
         return new ResponseEntity<>(qrService.generarQR(size,data),HttpStatus.OK);
     }
 }
 