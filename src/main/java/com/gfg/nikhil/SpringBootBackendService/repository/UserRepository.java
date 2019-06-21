package com.gfg.nikhil.SpringBootBackendService.repository;


import com.gfg.nikhil.SpringBootBackendService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {


    //List<User> findById(Long id);
}