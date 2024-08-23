package com.turfbookingservice.service;

import com.turfbookingservice.model.Sample;
import com.turfbookingservice.repository.SampleRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @Autowired
    private SampleRepoService sampleRepoService;

    public String saveEntry(final Sample sample) {
        sampleRepoService.saveSample(sample);
        return "Saved successfully";
    }
}
