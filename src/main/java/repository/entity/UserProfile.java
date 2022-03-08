package repository.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Entity
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userProfileNo;
    @JoinColumn(name = "user_no")
    @OneToOne
    private User user;
    @JoinColumn(name = "image_no")
    @OneToOne
    private Image image;

}
