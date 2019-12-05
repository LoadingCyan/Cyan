package com.cvit.gmall.user.service.impl;

import com.cvit.gmall.user.bean.UmsMember;
import com.cvit.gmall.user.mapper.UserMapper;
import com.cvit.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMemberList = userMapper.selectAll();//   userMapper.selectAllUser();
        return umsMemberList;
    }
}
