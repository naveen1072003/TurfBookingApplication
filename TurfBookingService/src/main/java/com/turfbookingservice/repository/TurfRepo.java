package com.turfbookingservice.repository;

import com.turfbookingservice.model.Turf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface TurfRepo extends JpaRepository<Turf,String> {


}
