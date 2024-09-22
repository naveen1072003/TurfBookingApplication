package com.turfbookingservice.repository.service.impl;

import com.turfbookingservice.dto.AddTurfDto;
import com.turfbookingservice.dto.ResponseDTO;
import com.turfbookingservice.repository.TurfRepo;
import com.turfbookingservice.repository.service.TurfRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class TurfRepoServiceImpl implements TurfRepoService {

    @Autowired
    private TurfRepo turfRepo;
    @Override
    public ResponseEntity<ResponseDTO> addTurf(AddTurfDto addTurfDto) {
        return turfRepo.save(a);
    }
}
