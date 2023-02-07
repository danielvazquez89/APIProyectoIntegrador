package com.example.apiintegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.apiintegrador.mensaje.Mensaje;


public interface MensajeRepository extends JpaRepository<Mensaje, Integer>{
}