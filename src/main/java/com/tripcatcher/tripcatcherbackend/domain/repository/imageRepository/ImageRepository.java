package com.tripcatcher.tripcatcherbackend.domain.repository.imageRepository;

import com.tripcatcher.tripcatcherbackend.domain.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}