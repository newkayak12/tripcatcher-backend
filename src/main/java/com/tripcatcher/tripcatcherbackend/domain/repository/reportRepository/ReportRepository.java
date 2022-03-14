package com.tripcatcher.tripcatcherbackend.domain.repository.reportRepository;

import com.tripcatcher.tripcatcherbackend.domain.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {
}