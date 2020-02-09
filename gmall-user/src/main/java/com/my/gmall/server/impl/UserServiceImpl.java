package com.my.gmall.server.impl;

import com.my.gamll.pojo.UmsMember;
import com.my.gamll.service.UserService;
import com.my.gmall.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
