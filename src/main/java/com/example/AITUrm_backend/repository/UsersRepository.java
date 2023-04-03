package com.example.AITUrm_backend.repository;

import com.example.AITUrm_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {
}
