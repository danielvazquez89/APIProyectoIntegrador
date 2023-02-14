package com.example.apiintegrador.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.apiintegrador.chat.Chat;

public interface ChatRepository extends JpaRepository<Chat, Integer>{
    @Query(value = "SELECT * FROM chat u WHERE u.id_usuario = :id_usuario or u.id_vendedor = :id_usuario", nativeQuery = true)
    List<Chat> findByUserId(@Param("id_usuario") Integer id_usuario);
}
