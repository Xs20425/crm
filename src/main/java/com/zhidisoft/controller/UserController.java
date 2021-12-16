package com.zhidisoft.controller;

import com.zhidisoft.entity.User;
import com.zhidisoft.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/userLogin.do")
    @ResponseBody
    public ModelMap login(User user, String remember_me, HttpSession session){
        User user1 = userService.selectByname(user.getUsername());
        ModelMap modelMap = new ModelMap();
        if (user.getPassword().equals(user1.getPassword())){
            session.setAttribute("user",user1);
            modelMap.put("success",true);
        }else {
            modelMap.put("success",false);
            modelMap.put("message","登录失败");
        }
        modelMap.put("user",user);
        return modelMap;
    }

    @RequestMapping("index.do")
    public String toIndex(){

        return "index";
    }

    @RequestMapping("index_menu.do")
    public String toIndex_menu(){

        return "hello";
    }
}
