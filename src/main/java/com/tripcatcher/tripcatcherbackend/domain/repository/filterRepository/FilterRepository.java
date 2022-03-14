package com.tripcatcher.tripcatcherbackend.domain.repository.filterRepository;

import com.tripcatcher.tripcatcherbackend.domain.entity.Filter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilterRepository extends JpaRepository<Filter, Long> {
}