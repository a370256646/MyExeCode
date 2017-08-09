package com.xp.dubboprivider.repository;

import com.xp.dubboapi.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserInfo,Integer> {
    public UserInfo getUserInfoByUserNameAndPassWord(String userName,String passWord);
}
