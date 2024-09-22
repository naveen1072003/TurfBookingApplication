package com.turfbookingservice.service.impl;

import com.turfbookingservice.dto.AddTurfDto;
import com.turfbookingservice.dto.ResponseDTO;
import com.turfbookingservice.repository.service.TurfRepoService;
import com.turfbookingservice.service.TurfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class TurfServiceImpl implements TurfService {

    @Autowired
    private TurfRepoService turfRepoService;
    @Override
    public ResponseEntity<ResponseDTO> addTurf(AddTurfDto addTurfDto) {
        return turfRepoService.;
    }
}
