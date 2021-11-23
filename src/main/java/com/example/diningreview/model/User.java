package com.example.diningreview.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public @Data class User {
    @Id
    private String name;
    private String city;
    private String state;
    private Integer zipcode;
    private Boolean hasPeanutAllergy;
    private Boolean hasEggAllergy;
}
