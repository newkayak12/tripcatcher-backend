package domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class LikeDto implements Serializable {
    private static final long serialVersionUID = -3561313300226748542L;
    private final Long likeNo;
    private final UserDto user;
    private final RoomDto room;
}
