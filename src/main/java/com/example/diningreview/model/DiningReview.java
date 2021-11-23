package com.example.diningreview.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public @Data class DiningReview {
    @Id
    private Long id;
    private String userName;
    private Long restaurantId;
    private String review;
    private Integer rating;
}
