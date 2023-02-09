package com.example.apiintegrador.juegos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.apiintegrador.repository.JuegosRepository;
import java.util.List;
import javax.transaction.Transactional;

@Service
@Transactional
public class JuegosService {
    @Autowired
    private JuegosRepository juegosRepository;
    public List<Juegos> listAllJuegos() {
        return juegosRepository.findAll();
    }

    public void saveJuego(Juegos juegos) {
        juegosRepository.save(juegos);
    }

    public List<Juegos> findJuegosByGenero(String genero) {
        return juegosRepository.findByGenero(genero);
    }

    public Juegos getJuego(Integer id) {
        return juegosRepository.findById(id).get();
    }

    public void deleteJuego(Integer id) {
        juegosRepository.deleteById(id);
    }
}