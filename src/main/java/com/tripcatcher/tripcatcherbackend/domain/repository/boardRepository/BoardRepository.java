package com.tripcatcher.tripcatcherbackend.domain.repository.boardRepository;

import com.tripcatcher.tripcatcherbackend.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}