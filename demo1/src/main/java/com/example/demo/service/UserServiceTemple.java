package com.example.demo.service;


import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;
import java.util.List;

@Service
public class UserServiceTemple implements UserService{

    final
    UserMapper userMapper;

    public UserServiceTemple(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    @Transactional
    public boolean batchRemoveUser(List<Integer> ids) {
        userMapper.batchRemoveUser(ids);
        return true;
    }

    @Override
    public int getUserNum() {
        return userMapper.getUserNum();
    }

    @Override
    public int getUserOfMan() {
        return userMapper.getManNum();
    }

    @Override
    public boolean isExistUser(String username) {
        if (userMapper.isExists(username)>0) return true;
        return false;
    }

    @Override
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }

    @Override
    public List<User> getUserByIds(List<Integer> ids) {
        return userMapper.getUserByIds(ids);
    }
}
