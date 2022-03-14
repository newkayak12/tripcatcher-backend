package domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserProfileDto implements Serializable {
    private static final long serialVersionUID = 6087403960202982423L;
    private final Long userProfileNo;
    private final UserDto user;
    private final ImageDto image;
}
