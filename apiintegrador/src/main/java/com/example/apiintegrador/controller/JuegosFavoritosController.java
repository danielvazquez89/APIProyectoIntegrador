package com.example.apiintegrador.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.apiintegrador.Juegos_Favoritos.Juegos_Favoritos;
import com.example.apiintegrador.Juegos_Favoritos.Juegos_FavoritosService;

@RestController
@RequestMapping("/juegos_favoritos")
public class JuegosFavoritosController {
    @Autowired
    Juegos_FavoritosService juegosFavoritosService;

    @GetMapping("")
    public List<Juegos_Favoritos> list() {
        return juegosFavoritosService.listAllJuegosFavoritos();
    }

    @GetMapping("/{id}")
    public List<Juegos_Favoritos> get(@PathVariable Integer id) {
        return juegosFavoritosService.findJuegosFavoritosUser(id);
    }

    @PostMapping("/")
    public void add(@RequestBody Juegos_Favoritos juegoFavorito) {
        juegosFavoritosService.saveJuegoFavorito(juegoFavorito);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        juegosFavoritosService.deleteJuegoFavorito(id);
    }
}