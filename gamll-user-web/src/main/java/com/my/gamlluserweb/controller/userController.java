package com.my.gamlluserweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.my.gamll.pojo.UmsMember;
import com.my.gamll.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class userController {
    @Reference//远程协议代理
    private UserService userService;

    @RequestMapping("get")
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }
}
