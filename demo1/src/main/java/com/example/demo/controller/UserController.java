package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUserNum")
    public int getUserNum(){
        return userService.getUserNum();
    }

    @GetMapping("/getUserByIds")
    public List<User> getUserByIds() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List<User> userList = userService.getUserByIds(list);
        System.out.println(userList);
        return userList;
    }

    @GetMapping("/getManNum")
    public int getManNum(){
        return userService.getUserOfMan();
    }

    @GetMapping("/getUserByName")
    public User getUserByName(){
        return userService.getUserByName("tian");
    }

    @GetMapping("/batchRemoveUser")
    public boolean batchRemoveUser(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        return userService.batchRemoveUser(list);
    }

    @GetMapping("/isExists")
    public String isExists(){
        if (userService.isExistUser("tian")) return "you";
        else return "wu";
    }
}
