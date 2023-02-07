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
import com.example.apiintegrador.compras.Compras;
import com.example.apiintegrador.compras.ComprasService;

@RestController
@RequestMapping("/compras")
public class ComprasController {
    @Autowired
    ComprasService comprasService;

    @GetMapping("")
    public List<Compras> list() {
        return comprasService.listAllCompras();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Compras> get(@PathVariable Integer id) {
        try {
            Compras compra = comprasService.getCompra(id);
            return new ResponseEntity<Compras>(compra, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Compras>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Compras compra) {
        comprasService.saveCompra(compra);
    }

    /*
     * @PutMapping("/{id}")
     * public ResponseEntity<?> update(@RequestBody Compras compra, @PathVariable
     * Integer id) {
     * try {
     * Compras existCompra = comprasService.getCompra(id);
     * compra.setId_usuario(id);
     * comprasService.saveCompra(compra);
     * return new ResponseEntity<>(HttpStatus.OK);
     * } catch (NoSuchElementException e) {
     * return new ResponseEntity<>(HttpStatus.NOT_FOUND);
     * }
     * }
     */

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        comprasService.deleteCompra(id);
    }
}