package com.example.apiintegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.apiintegrador.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{
}
