package com.tripcatcher.tripcatcherbackend.domain.repository.reservationRepository;

import com.tripcatcher.tripcatcherbackend.domain.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}