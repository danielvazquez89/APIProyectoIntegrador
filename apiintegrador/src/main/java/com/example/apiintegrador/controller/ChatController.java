package com.example.apiintegrador.controller;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.apiintegrador.chat.Chat;
import com.example.apiintegrador.chat.ChatService;

@RestController
@RequestMapping("/chat")
public class ChatController {
    @Autowired
    ChatService chatService;

    @GetMapping("")
    public List<Chat> list() {
        return chatService.listAllChats();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Chat> get(@PathVariable Integer id) {
        try {
            Chat chat = chatService.getChat(id);
            return new ResponseEntity<Chat>(chat, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Chat>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Chat chat) {
        chatService.saveChat(chat);
    }
    /*
     * @PutMapping("/{id}")
     * public ResponseEntity<?> update(@RequestBody Chat chat, @PathVariable Integer
     * id) {
     * try {
     * Chat existChat = chatService.getChat(id);
     * chat.setId_chat(id);
     * chatService.saveChat(chat);
     * return new ResponseEntity<>(HttpStatus.OK);
     * } catch (NoSuchElementException e) {
     * return new ResponseEntity<>(HttpStatus.NOT_FOUND);
     * }
     * }
     */

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        chatService.deleteChat(id);
    }
}