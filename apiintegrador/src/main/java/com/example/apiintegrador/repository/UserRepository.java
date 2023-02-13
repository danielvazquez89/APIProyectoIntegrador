package com.example.apiintegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.apiintegrador.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    @Query(value = "SELECT * FROM usuario u WHERE u.mail = :mail limit 1", nativeQuery = true)
    User findByEmail(@Param("mail") String mail);
}
