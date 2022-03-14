package com.tripcatcher.tripcatcherbackend.domain.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
@EqualsAndHashCode
@Entity
public class RoomImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomImageNo;
    @ManyToOne
    @JoinColumn(name = "room_no")
    private Room room;
    @ManyToOne
    @JoinColumn(name = "image_no")
    private Image image;
}
