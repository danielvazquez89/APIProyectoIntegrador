package com.example.apiintegrador.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.apiintegrador.repository.ChatRepository;
import java.util.List;

import javax.transaction.Transactional;
@Service
@Transactional
public class ChatService {
    @Autowired
    private ChatRepository chatRepository;
    public List<Chat> listAllChats() {
        return chatRepository.findAll();
    }

    public void saveChat(Chat chat) {
        chatRepository.save(chat);
    }

    public Chat getChat(Integer id) {
        return chatRepository.findById(id).get();
    }

    public void deleteChat(Integer id) {
        chatRepository.deleteById(id);
    }
}