package com.example.apiintegrador.generos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.apiintegrador.repository.GenerosRepository;
import java.util.List;

import javax.transaction.Transactional;
@Service
@Transactional
public class GenerosService {
    @Autowired
    private GenerosRepository generosRepository;
    public List<Generos> listAllGeneros() {
        return generosRepository.findAll();
    }

    public Generos getTipo_genero(String tipo_genero) {
        return generosRepository.findById(tipo_genero).get();
    }

}