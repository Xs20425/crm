package com.zhidisoft.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhidisoft.dao.UserDao;
import com.zhidisoft.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public User selectByname(String username){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username",username);
        return userDao.selectOne(wrapper);
    }
}
