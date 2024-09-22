package com.turfbookingservice.service;

import com.turfbookingservice.dto.AddTurfDto;
import com.turfbookingservice.dto.ResponseDTO;
import com.turfbookingservice.model.Turf;
import com.turfbookingservice.repository.service.TurfRepoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface TurfService {

    public ResponseEntity<ResponseDTO> addTurf(AddTurfDto addTurfDto);
}
