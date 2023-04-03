package com.example.AITUrm_backend.service;

import com.example.AITUrm_backend.model.User;

import java.util.List;

public interface UserService {

    User getUserById(Long id);

    void save(User user);

    void deleteById(Long id);

    List<User> getAll();
}
