package com.example.apiintegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.apiintegrador.juegos.Juegos;


public interface JuegosRepository extends JpaRepository<Juegos, Integer>{
}
