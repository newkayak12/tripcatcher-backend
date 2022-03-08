package repository.entity;

import lombok.*;
import repository.entity.converter.BoardIsBannerConverter;
import repository.entity.converter.BoardTypeConverter;
import repository.entity.enums.BoardIsBanner;
import repository.entity.enums.BoardType;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardNo;
    @Convert(converter = BoardTypeConverter.class)
    private BoardType boardType;
    @Column(length = 100)
    private String boardTitleKR;
    @Column(length = 100)
    private String boardTitleJP;
    @Column(length = 100)
    private String boardTitleEN;
    @Column(length = 100)
    private String boardSummaryKR;
    @Column(length = 100)
    private String boardSummaryJP;
    @Column(length = 100)
    private String boardSummaryEN;
    @Column(columnDefinition = "TEXT")
    private String boardContentsKR;
    @Column(columnDefinition = "TEXT")
    private String boardContentsJP;
    @Column(columnDefinition = "TEXT")
    private String boardContentsEN;
    @Convert(converter = BoardIsBannerConverter.class)
    private BoardIsBanner boardIsBanner;
    @OneToOne(mappedBy = "board")
    private BoardImage boardImage;
}
