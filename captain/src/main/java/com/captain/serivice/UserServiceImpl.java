package com.captain.serivice;

import com.captain.beans.entity.User;
import com.captain.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auth sailor
 * @date 2022/4/23 18:42
 * @desc UserServiceImpl
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User isUser(String name, String password) {
        return userMapper.isUser(name, password);
    }
}
