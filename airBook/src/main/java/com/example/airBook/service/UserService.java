package com.example.airBook.service;

import com.example.airBook.dao.UserDao;
import com.example.airBook.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserDao userDao;

    public void registerForm(User user) {
        userDao.save(user);
    }


    public User findByUserName(String userName){
        return userDao.findByUserName(userName);
    }

}
