package com.tripcatcher.tripcatcherbackend.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ImageDto implements Serializable {
    private static final long serialVersionUID = 3556648620980470709L;
    private final Long imageNo;
    private final String imageName;
    private final String imagePath;
    private final Long imageSize;
    private final String imageType;
}
