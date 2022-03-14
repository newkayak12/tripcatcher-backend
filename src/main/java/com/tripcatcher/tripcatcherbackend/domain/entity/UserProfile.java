package com.tripcatcher.tripcatcherbackend.domain.entity;

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
