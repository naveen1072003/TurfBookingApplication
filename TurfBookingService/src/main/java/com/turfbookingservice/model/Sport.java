package com.turfbookingservice.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Sport {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private String sportId;

    private String name;
}
