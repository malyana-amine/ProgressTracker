package org.example.Services.User;

import org.example.Entities.User;
import org.example.Repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        // Implement the logic to save a user in the repository
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        // Implement the logic to update a user in the repository
        // You may need to fetch the user from the repository, make changes, and save it.
        return userRepository.save(user);
    }

    @Override
    public List<User> findAllUser() {
        // Implement the logic to retrieve all users from the repository
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findByIdUser(Long id) {
        // Implement the logic to retrieve a user by their ID from the repository
        return userRepository.findById(id);
    }

    @Override
    public void deleteUser(User user) {
        // Implement the logic to delete a user from the repository
        userRepository.delete(user);
    }
}
