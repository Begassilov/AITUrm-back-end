package com.example.aiturm.service;

import com.example.aiturm.model.User;
import com.example.aiturm.repository.UsersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Slf4j
@Service
public class IUserService implements UserService{

    private final UsersRepository repository;

    @Autowired
    public IUserService(UsersRepository repository) {
        this.repository = repository;
    }

    @Override
    public User getUserById(Long id) {
        return repository.getById(id);
    }

    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }
}
