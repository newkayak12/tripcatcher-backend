package domain.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
@EqualsAndHashCode
@Entity
public class BoardImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardImageNo;
    @OneToOne
    @JoinColumn(name = "board_no")
    private Board board;
    @OneToOne
    @JoinColumn(name = "image_no")
    private Image image;
}
