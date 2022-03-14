package com.tripcatcher.tripcatcherbackend.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AddressDto implements Serializable {
    private static final long serialVersionUID = -3762086429041541842L;
    private final String zipCode;
    private final String address;
    private final String addressDetail;
}
