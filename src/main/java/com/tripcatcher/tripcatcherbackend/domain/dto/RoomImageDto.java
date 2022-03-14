package com.tripcatcher.tripcatcherbackend.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoomImageDto implements Serializable {
    private static final long serialVersionUID = -1110421682087701793L;
    private final Long roomImageNo;
    private final RoomDto room;
    private final ImageDto image;
}
