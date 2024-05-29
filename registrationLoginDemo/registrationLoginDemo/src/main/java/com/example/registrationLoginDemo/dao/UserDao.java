package com.example.registrationLoginDemo.dao;

import com.example.registrationLoginDemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

    public Boolean existsByPassword(String password);

}
