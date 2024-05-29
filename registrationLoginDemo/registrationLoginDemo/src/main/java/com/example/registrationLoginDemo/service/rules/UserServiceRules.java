package com.example.registrationLoginDemo.service.rules;

import com.example.registrationLoginDemo.dao.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceRules {

    private UserDao userDao ;

    public void CheckIfUserAlreadyExists(String password) {

        if(this.userDao.existsByPassword(password)) {
            }
        else {
            throw new RuntimeException();
        }
    }




}
