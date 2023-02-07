package com.example.apiintegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apiintegrador.UsuariosFavoritos.UsuariosFavoritos;


public interface UsuariosFavoritosRepository extends JpaRepository<UsuariosFavoritos, Integer>{
}
