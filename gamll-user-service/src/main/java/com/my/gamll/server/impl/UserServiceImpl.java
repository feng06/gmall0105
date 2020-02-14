package com.my.gamll.server.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.my.gamll.pojo.UmsMember;
import com.my.gamll.service.UserService;
import com.my.gamll.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAllUser();
        return umsMembers;
    }
}
