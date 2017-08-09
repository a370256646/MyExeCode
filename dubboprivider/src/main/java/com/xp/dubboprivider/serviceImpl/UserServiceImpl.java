package com.xp.dubboprivider.serviceImpl;


import com.alibaba.dubbo.config.annotation.Service;
import com.xp.dubboapi.model.UserInfo;
import com.xp.dubboapi.service.expIUserservice;

@Service(version="1.0.0")
public class UserServiceImpl implements expIUserservice {
//    @Autowired
//    IUserRepository userRepository;

    @Override
    public String login(UserInfo user) {
//        UserInfo userInfo=userRepository.getUserInfoByUserNameAndPassWord(user.getUserName(),user.getPassWord());
//        if(userInfo!=null){
//            return "login success!";
//        }
        return "login failture";
    }
}
