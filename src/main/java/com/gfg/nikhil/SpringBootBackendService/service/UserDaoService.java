package com.gfg.nikhil.SpringBootBackendService.service;

import com.gfg.nikhil.SpringBootBackendService.model.User;
import com.gfg.nikhil.SpringBootBackendService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDaoService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUsers(){


        return userRepository.findAll();

    }

    public Optional<User> findUserById(Long id){

        return userRepository.findById(id);
    }

    public User createUser(User user){

        userRepository.save(user);
        return user;
    }
    public User updateUser(User user){

        user.setFirstName(user.getFirstName());
        user.setLastName(user.getLastName());
        userRepository.save(user);
        return user;
    }

    public String deleteUser(Long id){

        userRepository.deleteById(id);
        return "Deleted user with id "+id;
    }
}
