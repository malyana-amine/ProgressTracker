package org.example.Services.User;

import org.example.Entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    User updateUser(User user);
    List<User> findAllUser();
    Optional<User> findByIdUser(Long id);
    void deleteUser(User user);
}
