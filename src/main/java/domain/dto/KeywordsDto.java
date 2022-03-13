package domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class KeywordsDto implements Serializable {
    private static final long serialVersionUID = -2776615958772644468L;
    private final Long keywordsNo;
    private final RoomDto room;
    private final String keywordKR;
    private final String keywordJP;
    private final String keywordEN;
}
