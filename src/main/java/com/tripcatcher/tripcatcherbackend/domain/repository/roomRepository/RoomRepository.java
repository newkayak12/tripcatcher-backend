package com.tripcatcher.tripcatcherbackend.domain.repository.roomRepository;

import com.tripcatcher.tripcatcherbackend.domain.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}