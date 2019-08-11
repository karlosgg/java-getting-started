package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/info")
public class InfoController {

    @RequestMapping("/")
    public ResponseEntity info(){
        Map response = new HashMap<>();
        response.put("response","Wellcome");
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
