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
@EqualsAndHashCode
@DynamicInsert
@DynamicUpdate
@Entity
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long likeNo;

    @ManyToOne
    @JoinColumn(name = "user_no")
    private User user;
    @ManyToOne
    @JoinColumn(name = "room_no")
    private Room room;
}
