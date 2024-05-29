package com.example.registrationLoginDemo.service.concretes;

import com.example.registrationLoginDemo.dao.UserDao;
import com.example.registrationLoginDemo.entities.User;
import com.example.registrationLoginDemo.service.abstracts.UserService;
import com.example.registrationLoginDemo.service.rules.UserServiceRules;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserDao userDao ;
    private UserServiceRules userServiceRules ;

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Override
    public void checkUser(String password) {

        userServiceRules.CheckIfUserAlreadyExists(password);
    }
}
