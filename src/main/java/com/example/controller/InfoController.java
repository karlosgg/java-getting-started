package com.example.controller;

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
