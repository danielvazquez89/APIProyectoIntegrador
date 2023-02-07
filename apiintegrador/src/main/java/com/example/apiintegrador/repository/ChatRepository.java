package com.example.apiintegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.apiintegrador.chat.Chat;

public interface ChatRepository extends JpaRepository<Chat, Integer>{
}
