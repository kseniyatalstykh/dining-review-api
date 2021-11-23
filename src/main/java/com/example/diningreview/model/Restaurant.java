package com.example.diningreview.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public @Data class Restaurant {
    @Id
    private Long id;
    private String name;
}
