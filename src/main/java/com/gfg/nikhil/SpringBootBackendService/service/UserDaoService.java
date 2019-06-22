package com.gfg.nikhil.SpringBootBackendService.service;

import com.gfg.nikhil.SpringBootBackendService.model.User;
import com.gfg.nikhil.SpringBootBackendService.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserDaoService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUsers(){


        return userRepository.findAll();

    }

    public User findUserById(Long id){

        Optional<User> userOptional= userRepository.findById(id);

        if(userOptional.isPresent()){
            log.debug("User found for id {} "+id);
            return userOptional.get();
        }
        else {
            log.debug("User not found for id {} "+id);
            throw new IllegalArgumentException();
        }
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
