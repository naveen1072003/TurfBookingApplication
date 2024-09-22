package com.turfbookingservice.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Turf {
@Id
@GeneratedValue(strategy = GenerationType.UUID)
private String turfId;

private String name;

@Embedded
private Address address;

private String userId;

@Embedded
private Location location;

@OneToMany(mappedBy = "turf")
private List<Amenity> amenityList;


private boolean isAvailable;
}
