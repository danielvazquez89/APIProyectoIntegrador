package com.example.apiintegrador.UsuariosFavoritos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.apiintegrador.repository.UsuariosFavoritosRepository;

import java.util.List;
import javax.transaction.Transactional;

@Service
@Transactional
public class UsuariosFavoritosService {
    @Autowired
    private UsuariosFavoritosRepository usuariosFavoritosRepository;
    public List<UsuariosFavoritos> listAllUsuariosFavoritos() {
        return usuariosFavoritosRepository.findAll();
    }

    public void saveUsuarioFavorito(UsuariosFavoritos juegos) {
        usuariosFavoritosRepository.save(juegos);
    }

    public UsuariosFavoritos getJuegoFavorito(Integer id) {
        return usuariosFavoritosRepository.findById(id).get();
    }

    public void deleteUsuarioFavorito(Integer id) {
        usuariosFavoritosRepository.deleteById(id);
    }

    public List<UsuariosFavoritos> findJuegosFavoritosUser(Integer id) {
        return usuariosFavoritosRepository.findByUserID(id);
    }
}
