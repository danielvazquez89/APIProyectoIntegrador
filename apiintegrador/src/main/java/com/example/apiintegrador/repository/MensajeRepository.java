package com.example.apiintegrador.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.apiintegrador.mensaje.Mensaje;


public interface MensajeRepository extends JpaRepository<Mensaje, Integer>{
    @Query(value = "SELECT * FROM mensaje u WHERE u.id_chat = :id_chat", nativeQuery = true)
    List<Mensaje> findByChatId(@Param("id_chat") Integer id_usuario);
}