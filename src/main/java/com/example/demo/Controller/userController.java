package com.example.demo.Controller;

import com.example.demo.Service.UserService;
import com.example.demo.mapper.usermapper;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class userController
{
    @Autowired
    UserService userService;
    @GetMapping
    public List<User> findAll()
    {
        List<User> users = userService.findAll();
        System.out.println("huchao444");
        return users;
    }
    @PostMapping
    public void add(User user)
    {
        userService.add(user);
    }
}
