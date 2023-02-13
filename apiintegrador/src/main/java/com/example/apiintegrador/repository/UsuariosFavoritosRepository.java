package com.example.apiintegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.apiintegrador.UsuariosFavoritos.UsuariosFavoritos;


public interface UsuariosFavoritosRepository extends JpaRepository<UsuariosFavoritos, Integer>{
    @Query(value = "SELECT * FROM usuarios_favoritos u WHERE u.id_usuario = :id", nativeQuery = true)
    List<UsuariosFavoritos> findByUserID(@Param("id") Integer id);
}
