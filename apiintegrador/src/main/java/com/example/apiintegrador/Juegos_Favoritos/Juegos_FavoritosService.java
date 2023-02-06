package com.example.apiintegrador.Juegos_Favoritos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.apiintegrador.repository.Juegos_FavoritosRepository;
import java.util.List;
import javax.transaction.Transactional;

@Service
@Transactional
public class Juegos_FavoritosService {
    @Autowired
    private Juegos_FavoritosRepository juegosFavoritosRepository;
    public List<Juegos_Favoritos> listAllJuegosFavoritos() {
        return juegosFavoritosRepository.findAll();
    }

    public void saveJuegoFavorito(Juegos_Favoritos juegos) {
        juegosFavoritosRepository.save(juegos);
    }

    public Juegos_Favoritos getJuegoFavorito(Integer id) {
        return juegosFavoritosRepository.findById(id).get();
    }

    public void deleteJuegoFavorito(Integer id) {
        juegosFavoritosRepository.deleteById(id);
    }
}
