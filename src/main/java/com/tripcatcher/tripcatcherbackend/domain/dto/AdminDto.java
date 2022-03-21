package com.tripcatcher.tripcatcherbackend.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class AdminDto implements Serializable {
    private static final long serialVersionUID = 8869770735993318871L;
    private  Long adminNo;
    private  String adminId;
    private  String adminPassword;
    private  String adminIpAddress;
    private  LocalDateTime adminLastSignDate;
}
