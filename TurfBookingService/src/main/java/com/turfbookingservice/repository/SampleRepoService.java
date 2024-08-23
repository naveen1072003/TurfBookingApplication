package com.turfbookingservice.repository;

import com.turfbookingservice.model.Sample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SampleRepoService {

    @Autowired
    private SampleRepo sampleRepo;

    public void saveSample(Sample sample) {
        sampleRepo.save(sample);
    }
}
