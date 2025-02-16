package com.turfbookingservice.repository;

import com.turfbookingservice.model.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepo extends JpaRepository<Sample, Integer> {
}
