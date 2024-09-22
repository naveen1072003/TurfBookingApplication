package com.turfbookingservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class TurfSport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer turfSportId;


    @ManyToOne
    @JoinColumn(name = "turfId")
    private Turf turf;

    @ManyToOne
    @JoinColumn(name = "sportId")
    private Sport sport;

    //price per hour
    private Integer price;

    private Boolean isAvailable;
}
