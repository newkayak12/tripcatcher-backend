package com.tripcatcher.tripcatcherbackend.domain.repository.vendorRepository;

import com.tripcatcher.tripcatcherbackend.domain.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}