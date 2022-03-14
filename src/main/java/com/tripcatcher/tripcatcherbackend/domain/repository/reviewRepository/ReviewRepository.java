package com.tripcatcher.tripcatcherbackend.domain.repository.reviewRepository;

import com.tripcatcher.tripcatcherbackend.domain.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}