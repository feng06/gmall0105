package com.my.gmall.controller;

import com.my.gamll.pojo.UmsMember;
import com.my.gamll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class userController {
    @Autowired
    private UserService userService;

    @RequestMapping("get")
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }
}
