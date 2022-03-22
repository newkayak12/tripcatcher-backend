package com.tripcatcher.tripcatcherbackend.domain.entity;

import com.tripcatcher.tripcatcherbackend.common.annotation.FetchWith;
import com.tripcatcher.tripcatcherbackend.common.entityListener.AdminEntityListener;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@DynamicInsert
@DynamicUpdate
@Entity
@EntityListeners(AdminEntityListener.class)
public class Admin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminNo;
    @Column(length = 30)
    private String adminId;
    @Column(length = 300)
    private String adminPassword;
    @Column(length = 20)
    private String adminIpAddress;
    @FetchWith
    private LocalDateTime adminLastSignDate;
}
