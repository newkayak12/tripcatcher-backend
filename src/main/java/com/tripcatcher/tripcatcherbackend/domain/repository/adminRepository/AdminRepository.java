package com.tripcatcher.tripcatcherbackend.domain.repository.adminRepository;

import com.tripcatcher.tripcatcherbackend.domain.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    public Admin findAdminByAdminId(String adminId);
}