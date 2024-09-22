package com.turfbookingservice.repository.service;

import com.turfbookingservice.dto.AddTurfDto;
import com.turfbookingservice.dto.ResponseDTO;
import com.turfbookingservice.repository.TurfRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface TurfRepoService
{
    public ResponseEntity<ResponseDTO> addTurf(AddTurfDto addTurfDto);
}
