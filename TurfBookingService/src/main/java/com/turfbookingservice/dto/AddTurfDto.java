package com.turfbookingservice.dto;

import com.turfbookingservice.model.Address;
import com.turfbookingservice.model.Location;
import jakarta.persistence.Embedded;

import java.util.List;

public class AddTurfDto {

    private String name;

    @Embedded
    private Address address;

    @Embedded
    private Location location;

    private String userId;

    private List<Integer> amenityList;

}
