package com.example.diningreview.controller;

import com.example.diningreview.model.DiningReview;
import com.example.diningreview.repository.DiningReviewRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dining-reviews")
public class DiningReviewController {
    private final DiningReviewRepository diningReviewRepository;

    public DiningReviewController(DiningReviewRepository diningReviewRepository) {
        this.diningReviewRepository = diningReviewRepository;
    }

    @GetMapping
    public Iterable<DiningReview> getDiningReviews() {
        return this.diningReviewRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DiningReview addDiningReview(@RequestBody DiningReview diningReview) {
        return this.diningReviewRepository.save(diningReview);
    }
}