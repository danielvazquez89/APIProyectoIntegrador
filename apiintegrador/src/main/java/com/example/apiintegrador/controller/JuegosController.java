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
import com.example.apiintegrador.juegos.Juegos;
import com.example.apiintegrador.juegos.JuegosService;

@RestController
@RequestMapping("/juegos")
public class JuegosController {
    @Autowired
    JuegosService juegosService;

    @GetMapping("")
    public List<Juegos> list() {
        return juegosService.listAllJuegos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Juegos> get(@PathVariable Integer id) {
        try {
            Juegos juego = juegosService.getJuego(id);
            return new ResponseEntity<Juegos>(juego, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Juegos>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/genero/{genero}")
    public List<Juegos> getByGenre(@PathVariable String genero) {
        return juegosService.findJuegosByGenero(genero);
    }

    @PostMapping("/")
    public List<Juegos> add(@RequestBody Juegos juego) {
        juegosService.saveJuego(juego);
        return juegosService.listAllJuegos();
    }

    /*
     * @PutMapping("/{id}")
     * public ResponseEntity<?> update(@RequestBody Juegos juego, @PathVariable
     * Integer id) {
     * try {
     * Juegos existJuego = juegosService.getJuego(id);
     * juego.setId_producto(id);
     * juegosService.saveJuego(juego);
     * return new ResponseEntity<>(HttpStatus.OK);
     * } catch (NoSuchElementException e) {
     * return new ResponseEntity<>(HttpStatus.NOT_FOUND);
     * }
     * }
     */
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        juegosService.deleteJuego(id);
    }
}