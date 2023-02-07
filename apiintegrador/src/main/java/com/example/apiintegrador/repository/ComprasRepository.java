package com.example.apiintegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apiintegrador.compras.Compras;

public interface ComprasRepository extends JpaRepository<Compras, Integer>{
}
