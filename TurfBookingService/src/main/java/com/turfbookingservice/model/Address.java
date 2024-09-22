package com.turfbookingservice.model;

import jakarta.annotation.sql.DataSourceDefinitions;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {
    private String street;

    private String city;

    private String state;

    private String zipcode;
}
