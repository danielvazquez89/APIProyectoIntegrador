package com.example.apiintegrador.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.apiintegrador.juegos.Juegos;

public interface JuegosRepository extends JpaRepository<Juegos, Integer> {
    @Query(value = "SELECT * FROM juegos u WHERE u.genero = :genero", nativeQuery = true)
    List<Juegos> findByGenero(@Param("genero") String genero);
}
