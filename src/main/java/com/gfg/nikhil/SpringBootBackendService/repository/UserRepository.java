package com.gfg.nikhil.SpringBootBackendService.repository;


import com.gfg.nikhil.SpringBootBackendService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {

    List<User> findByFirstName(String firstName);
    List<User> findByFirstNameAndLastName(String firstName,String lastName);
}