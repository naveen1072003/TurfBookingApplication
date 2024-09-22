package com.turfbookingservice.controller;

import com.turfbookingservice.api.TurfApi;
import com.turfbookingservice.dto.AddTurfDto;
import com.turfbookingservice.dto.ResponseDTO;
import com.turfbookingservice.service.TurfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("Turf")
public class TurfController  implements TurfApi {

  @Autowired
  private TurfService turfService;

  @PostMapping("add")
    public ResponseEntity<ResponseDTO> addTurf(@RequestBody AddTurfDto addTurfDto){
       return turfService.addTurf(addTurfDto);
  }


}
