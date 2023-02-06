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
import org.springframework.web.bind.annotation.PutMapping;
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
    public ResponseEntity<Juegos_Favoritos> get(@PathVariable Integer id) {
        try {
            Juegos_Favoritos juegosFavoritos = juegosFavoritosService.getJuegoFavorito(id);
            return new ResponseEntity<Juegos_Favoritos>(juegosFavoritos, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Juegos_Favoritos>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Juegos_Favoritos juegoFavorito) {
        juegosFavoritosService.saveJuegoFavorito(juegoFavorito);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Juegos_Favoritos juego, @PathVariable Integer id) {
        try {
            Juegos_Favoritos existJuego = juegosFavoritosService.getJuegoFavorito(id);
            juego.setId_producto(id);
            juegosFavoritosService.saveJuegoFavorito(juego);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        juegosFavoritosService.deleteJuegoFavorito(id);
    }
}