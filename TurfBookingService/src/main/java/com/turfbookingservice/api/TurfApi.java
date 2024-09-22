package com.turfbookingservice.api;

import com.turfbookingservice.dto.AddTurfDto;
import com.turfbookingservice.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface TurfApi {
    public ResponseEntity<ResponseDTO> addTurf(@RequestBody AddTurfDto addTurfDto);
}
