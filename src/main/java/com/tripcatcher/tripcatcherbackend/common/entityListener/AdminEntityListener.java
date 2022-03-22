package com.tripcatcher.tripcatcherbackend.common.entityListener;

import com.tripcatcher.tripcatcherbackend.domain.entity.Admin;
import com.tripcatcher.tripcatcherbackend.domain.repository.adminRepository.AdminRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.PostLoad;
import javax.transaction.Transactional;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@Slf4j
@Transactional
public class AdminEntityListener {
    private AdminRepository adminRepository;

    @PostLoad
    public void postLoad(Admin entity){
//        Field[] fields = entity.getClass().getDeclaredFields();
//        Method[] methods = entity.getClass().getMethods();
//        Arrays.stream(fields).forEach(System.out::println);
//        Arrays.stream(methods).forEach(System.out::println);
        entity.setAdminLastSignDate(LocalDateTime.now());
    }
}
