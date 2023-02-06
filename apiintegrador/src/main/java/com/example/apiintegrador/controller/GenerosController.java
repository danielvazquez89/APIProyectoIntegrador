package com.example.apiintegrador.controller;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.apiintegrador.generos.Generos;
import com.example.apiintegrador.generos.GenerosService;

@RestController
@RequestMapping("/generos")
public class GenerosController {
    @Autowired
    GenerosService generosService;

    @GetMapping("")
    public List<Generos> list() {
        return generosService.listAllGeneros();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Generos> get(@PathVariable String id) {
        try {
            Generos genero = generosService.getTipo_genero(id);
            return new ResponseEntity<Generos>(genero, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Generos>(HttpStatus.NOT_FOUND);
        }
    }
}