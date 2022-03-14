package com.tripcatcher.tripcatcherbackend.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class BoardImageDto implements Serializable {
    private static final long serialVersionUID = -7623044600607828016L;
    private final Long boardImageNo;
    private final BoardDto board;
    private final ImageDto image;
}
