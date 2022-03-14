package com.tripcatcher.tripcatcherbackend.domain.entity;

import com.tripcatcher.tripcatcherbackend.domain.entity.converter.BoardIsBannerConverter;
import com.tripcatcher.tripcatcherbackend.domain.entity.converter.BoardTypeConverter;
import com.tripcatcher.tripcatcherbackend.domain.entity.enums.BoardIsBanner;
import com.tripcatcher.tripcatcherbackend.domain.entity.enums.BoardType;
import lombok.*;

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
    @Column(length = 100, name = "board_title_KR")
    private String boardTitleKR;
    @Column(length = 100, name = "board_title_JP")
    private String boardTitleJP;
    @Column(length = 100, name = "board_title_EN")
    private String boardTitleEN;
    @Column(length = 100, name = "board_summary_KR")
    private String boardSummaryKR;
    @Column(length = 100, name = "board_summary_JP")
    private String boardSummaryJP;
    @Column(length = 100, name = "board_summary_EN")
    private String boardSummaryEN;
    @Column(columnDefinition = "TEXT", name = "board_contents_KR")
    private String boardContentsKR;
    @Column(columnDefinition = "TEXT", name = "board_contents_JP")
    private String boardContentsJP;
    @Column(columnDefinition = "TEXT", name = "board_contents_EN")
    private String boardContentsEN;
    @Convert(converter = BoardIsBannerConverter.class)
    private BoardIsBanner boardIsBanner;
    @OneToOne(mappedBy = "board")
    private BoardImage boardImage;
}
