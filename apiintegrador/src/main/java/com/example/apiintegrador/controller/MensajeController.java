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
import com.example.apiintegrador.mensaje.Mensaje;
import com.example.apiintegrador.mensaje.MensajeService;

@RestController
@RequestMapping("/mensaje")
public class MensajeController {
    @Autowired
    MensajeService mensajeService;

    @GetMapping("")
    public List<Mensaje> list() {
        return mensajeService.listAllMessages();
    }

    @GetMapping("/chat/{id}")
    public List<Mensaje> getMessagesChat(@PathVariable Integer id) {
        return mensajeService.findMessagesByChatId(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mensaje> get(@PathVariable Integer id) {
        try {
            Mensaje mensaje = mensajeService.getMessage(id);
            return new ResponseEntity<Mensaje>(mensaje, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Mensaje>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Mensaje mensaje) {
        mensajeService.saveMessage(mensaje);
    }

    /*
     * @PutMapping("/{id}")
     * public ResponseEntity<?> update(@RequestBody Mensaje mensaje, @PathVariable
     * Integer id) {
     * try {
     * Mensaje existMensaje = mensajeService.getMessage(id);
     * mensaje.setId_chat(id);
     * mensajeService.saveMessage(mensaje);
     * return new ResponseEntity<>(HttpStatus.OK);
     * } catch (NoSuchElementException e) {
     * return new ResponseEntity<>(HttpStatus.NOT_FOUND);
     * }
     * }
     */

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        mensajeService.deleteMessage(id);
    }
}