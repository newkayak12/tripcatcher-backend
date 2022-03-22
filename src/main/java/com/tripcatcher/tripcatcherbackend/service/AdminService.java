package com.tripcatcher.tripcatcherbackend.service;

import com.tripcatcher.tripcatcherbackend.common.auth.TokenManager;
import com.tripcatcher.tripcatcherbackend.common.constcode.ConstCode;
import com.tripcatcher.tripcatcherbackend.common.exceptions.AccessDenied;
import com.tripcatcher.tripcatcherbackend.common.exceptions.ExceptionLanguage;
import com.tripcatcher.tripcatcherbackend.domain.dto.AdminDto;
import com.tripcatcher.tripcatcherbackend.domain.entity.Admin;
import com.tripcatcher.tripcatcherbackend.domain.repository.adminRepository.AdminRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Slf4j
@Transactional
@Service
@RequiredArgsConstructor
public class AdminService {
    private final ModelMapper modelMapper;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final TokenManager tokenManager;
    private final AdminRepository adminRepository;

    public Map<String, Object> signIn(@RequestParam String id, @RequestParam String password, @RequestParam String ipAddress) throws AccessDenied {
        Admin admin = adminRepository.findAdminByAdminId(id);
        if(Objects.isNull(admin)){
            throw new AccessDenied(ExceptionLanguage.NOT_EXIST_USER.getKR());
        }
        AdminDto dto = new AdminDto();
        modelMapper.map(admin, dto);
        if(!bCryptPasswordEncoder.matches(password, dto.getAdminPassword())){
            throw new AccessDenied(ExceptionLanguage.PASSWORD_MISMATCH.getKR());
        }
        if(Objects.isNull(dto.getAdminIpAddress())){
            admin.setAdminIpAddress(ipAddress);
            adminRepository.save(admin);
        }
        if(!ipAddress.equals(dto.getAdminIpAddress())){
            throw new AccessDenied(ExceptionLanguage.DIFFERENT_IP_ADDRESS.getKR());
        }
        String token = tokenManager.adminEncrypt(dto, ConstCode.SALT);
        dto.setAdminPassword("");
        Map<String,Object> result = new HashMap<>();
        result.put("userData", dto);
        result.put("token", token);
        return result;
    }
}
