package com.turfbookingservice.controller;

import com.turfbookingservice.dto.ResponseDTO;
import com.turfbookingservice.model.Sample;
import com.turfbookingservice.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @PostMapping("/save")
    ResponseDTO saveEntry(@RequestBody Sample sample){
        return ResponseDTO.builder().object(sampleService.saveEntry(sample)).build();
    }
}
