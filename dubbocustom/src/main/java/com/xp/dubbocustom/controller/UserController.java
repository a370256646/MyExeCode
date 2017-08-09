package com.xp.dubbocustom.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xp.dubboapi.model.UserInfo;
import com.xp.dubboapi.service.expIUserservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Reference(version = "1.0.0",interfaceClass = expIUserservice.class)
    expIUserservice userService;  //注意,这里是通过注册中心去找对应的提供者,所以需要给接口

    @RequestMapping("/login")
    @ResponseBody
    public String preLogin(UserInfo user){
        String loginRes=userService.login(user);
        return loginRes;
    }
}
