package com.zhidisoft;

import com.zhidisoft.entity.User;
import com.zhidisoft.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import javax.annotation.Resource;

@SpringBootTest
class CrmApplicationTests {

    @Resource
    private UserService userService;


    @Test
    void contextLoads() {
        User user = userService.selectByname("admin");
        System.out.println(user.getPassword());
    }

}
