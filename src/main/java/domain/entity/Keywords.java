package domain.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@DynamicInsert
@DynamicUpdate
@Entity
public class Keywords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long keywordsNo;
    @ManyToOne
    @JoinColumn(name = "room_no")
    private Room room;
    @Column(name = "keyword_KR", length = 100)
    private String keywordKR;
    @Column(name = "keyword_JP", length = 100)
    private String keywordJP;
    @Column(name = "keyword_EN", length = 100)
    private String keywordEN;

}
