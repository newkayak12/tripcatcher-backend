package com.tripcatcher.tripcatcherbackend.common.auth;

import com.tripcatcher.tripcatcherbackend.domain.dto.AdminDto;
import com.tripcatcher.tripcatcherbackend.domain.dto.UserDto;
import com.tripcatcher.tripcatcherbackend.domain.dto.VendorDto;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class TokenManager {
    public String userEncrypt(UserDto userDto, String salt){
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("userNo", userDto.getUserNo());
        userMap.put("userId", userDto.getUserId());
        userMap.put("userPassword", userDto.getUserPassword());
        userMap.put("userNickName", userDto.getUserNickname());
        userMap.put("userPhoneNumber", userDto.getUserPhoneNumber());
        Date now = new Date();
        return Jwts.builder()
                .setHeaderParam(Header.TYPE, Header.JWT_TYPE)
                .setIssuer("Server")
                .setIssuedAt(now)
                .setExpiration(new Date(now.getTime()+ Duration.ofHours(24).toHours()))
                .setClaims(userMap)
                .signWith(SignatureAlgorithm.HS512, salt.getBytes())
                .compact();
    }
    public String vendorEncrypt(VendorDto vendorDto, String salt){
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("vendorNo", vendorDto.getVendorNo());
        userMap.put("vendorId", vendorDto.getVendorId());
        userMap.put("vendorPassword", vendorDto.getVendorPassword());
        userMap.put("vendorPhoneNumber", vendorDto.getVendorPhoneNumber());
        Date now = new Date();
        return Jwts.builder()
                .setHeaderParam(Header.TYPE, Header.JWT_TYPE)
                .setIssuer("Server")
                .setIssuedAt(now)
                .setExpiration(new Date(now.getTime()+ Duration.ofHours(24).toHours()))
                .setClaims(userMap)
                .signWith(SignatureAlgorithm.HS512, salt.getBytes())
                .compact();
    }
    public String adminEncrypt(AdminDto adminDto, String salt){
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("adminNo", adminDto.getAdminNo());
        userMap.put("adminId", adminDto.getAdminId());
        userMap.put("adminPassword", adminDto.getAdminPassword());
        userMap.put("adminIpAddress", adminDto.getAdminIpAddress());
        Date now = new Date();
        return Jwts.builder()
                .setHeaderParam(Header.TYPE, Header.JWT_TYPE)
                .setIssuer("Server")
                .setIssuedAt(now)
                .setExpiration(new Date(now.getTime()+ Duration.ofHours(24).toHours()))
                .setClaims(userMap)
                .signWith(SignatureAlgorithm.HS512, salt.getBytes())
                .compact();
    }
    public Claims decrypt(String token, String salt){
        return Jwts.parser()
                .setSigningKey(salt.getBytes())
                .parseClaimsJws(token)
                .getBody();
    }
}
