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
import com.example.apiintegrador.UsuariosFavoritos.UsuariosFavoritos;
import com.example.apiintegrador.UsuariosFavoritos.UsuariosFavoritosService;

@RestController
@RequestMapping("/usuarios_favoritos")
public class UsuariosFavoritosController {
    @Autowired
    UsuariosFavoritosService usuariosFavoritosService;

    @GetMapping("")
    public List<UsuariosFavoritos> list() {
        return usuariosFavoritosService.listAllUsuariosFavoritos();
    }

    @GetMapping("/{id}")
    public List<UsuariosFavoritos> get(@PathVariable Integer id) {
        return usuariosFavoritosService.findJuegosFavoritosUser(id);
    }
/*
    @GetMapping("/{id}")
    public ResponseEntity<UsuariosFavoritos> get(@PathVariable Integer id) {
        try {
            UsuariosFavoritos usuariosFavoritos = usuariosFavoritosService.getJuegoFavorito(id);
            return new ResponseEntity<UsuariosFavoritos>(usuariosFavoritos, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<UsuariosFavoritos>(HttpStatus.NOT_FOUND);
        }
    }
*/

    @PostMapping("/")
    public void add(@RequestBody UsuariosFavoritos usuarioFavorito) {
        usuariosFavoritosService.saveUsuarioFavorito(usuarioFavorito);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        usuariosFavoritosService.deleteUsuarioFavorito(id);
    }
}