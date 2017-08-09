package com.xp.dubboapi.service;


import com.xp.dubboapi.model.UserInfo;

public interface expIUserservice {
    /**
     * 暴露一个登陆接口出去
     * @param user 登陆用户
     */
    public String login(UserInfo user);
}
