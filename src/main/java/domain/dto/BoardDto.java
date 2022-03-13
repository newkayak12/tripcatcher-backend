package domain.dto;

import domain.entity.enums.BoardIsBanner;
import domain.entity.enums.BoardType;
import lombok.Data;

import java.io.Serializable;

@Data
public class BoardDto implements Serializable {
    private static final long serialVersionUID = 2565240041971031326L;
    private final Long boardNo;
    private final BoardType boardType;
    private final String boardTitleKR;
    private final String boardTitleJP;
    private final String boardTitleEN;
    private final String boardSummaryKR;
    private final String boardSummaryJP;
    private final String boardSummaryEN;
    private final String boardContentsKR;
    private final String boardContentsJP;
    private final String boardContentsEN;
    private final BoardIsBanner boardIsBanner;
    private final BoardImageDto boardImage;
}
