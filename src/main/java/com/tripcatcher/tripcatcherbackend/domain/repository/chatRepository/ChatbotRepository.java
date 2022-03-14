package com.tripcatcher.tripcatcherbackend.domain.repository.chatRepository;

import com.tripcatcher.tripcatcherbackend.domain.entity.Chatbot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatbotRepository extends JpaRepository<Chatbot, Long> {
}