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
        log.info("getUserById() -> " + id);
        return repository.getReferenceById(id);
    }

    @Override
    public void save(User user) {
        log.info("save() -> " + user.toString());
        repository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        log.info("deleteById() -> " + id);
        repository.deleteById(id);
    }

    @Override
    public List<User> getAll() {
        log.info("deleteById()");
        return repository.findAll();
    }
}
