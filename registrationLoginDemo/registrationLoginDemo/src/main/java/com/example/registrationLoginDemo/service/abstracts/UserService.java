package com.example.registrationLoginDemo.service.abstracts;

import com.example.registrationLoginDemo.entities.User;

public interface UserService {

    public void saveUser(User user) ;
    public void checkUser(String password);
}
