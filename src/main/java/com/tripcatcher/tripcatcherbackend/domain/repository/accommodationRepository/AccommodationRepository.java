package com.tripcatcher.tripcatcherbackend.domain.repository.accommodationRepository;

import com.tripcatcher.tripcatcherbackend.domain.entity.Accommodation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccommodationRepository extends JpaRepository<Accommodation, Long> {
}