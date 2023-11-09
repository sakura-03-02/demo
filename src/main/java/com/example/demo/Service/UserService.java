package com.example.demo.Service;

import com.example.demo.mapper.usermapper;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    
    @Autowired
   usermapper userMapper;
    public List<User> findAll()
    {
        List<User> users = userMapper.selectList(null);
        return users;
    }
    public void add(User user)
    {
        userMapper.insert(user);
    }
}
