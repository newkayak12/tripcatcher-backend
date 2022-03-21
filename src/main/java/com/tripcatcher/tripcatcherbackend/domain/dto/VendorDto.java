package com.tripcatcher.tripcatcherbackend.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class VendorDto implements Serializable {
    private static final long serialVersionUID = 6399503259737223231L;
    private Long vendorNo;
    private String vendorId;
    private String vendorPassword;
    private String VendorNameKR;
    private String VendorNameJP;
    private String VendorNameEN;
    private String vendorPhoneNumber;
    private LocalDateTime vendorLastSignDate;
    private AccommodationDto accommodation;
}
