package com.example.springboot.service;

import com.example.springboot.mapper.UserMapper;
import com.example.springboot.mapper.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @USER: Jiang-XK
 * @DESCRIPTION:
 * @DATE: 2021/1/14 17:06
 * @param:
 */

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public Users Sel(int id){
        return userMapper.Sel(id);
    }

}