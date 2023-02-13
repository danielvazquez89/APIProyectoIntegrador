package com.example.apiintegrador.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.apiintegrador.Juegos_Favoritos.Juegos_Favoritos;



public interface Juegos_FavoritosRepository extends JpaRepository<Juegos_Favoritos, Integer>{
    @Query(value = "SELECT * FROM juegos_favoritos u WHERE u.id_usuario = :id", nativeQuery = true)
    List<Juegos_Favoritos> findByUserID(@Param("id") Integer id);
}
