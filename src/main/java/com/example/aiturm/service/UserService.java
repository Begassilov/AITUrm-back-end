package com.example.aiturm.service;

import com.example.aiturm.model.User;

import java.util.List;

public interface UserService {

    User getUserById(Long id);

    void save(User user);

    void deleteById(Long id);

    List<User> getAll();
}
