package com.test.user.service;

import com.test.user.mapper.UserMapper;
import com.test.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    public User queryById(Long id) {
        return userMapper.findById(id);
    }
}