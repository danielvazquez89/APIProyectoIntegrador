package com.example.apiintegrador.mensaje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.apiintegrador.repository.MensajeRepository;

import java.util.List;

import javax.transaction.Transactional;
@Service
@Transactional
public class MensajeService {
    @Autowired
    private MensajeRepository mensajeRepository;
    public List<Mensaje> listAllMessages() {
        return mensajeRepository.findAll();
    }

    public List<Mensaje> findMessagesByChatId(Integer id) {
        return mensajeRepository.findByChatId(id);
    }

    public void saveMessage(Mensaje mensaje) {
        mensajeRepository.save(mensaje);
    }

    public Mensaje getMessage(Integer id) {
        return mensajeRepository.findById(id).get();
    }

    public void deleteMessage(Integer id) {
        mensajeRepository.deleteById(id);
    }
}