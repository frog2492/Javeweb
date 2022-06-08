package com.yxy.dao.impl;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.yxy.dao.UserDao;
import com.yxy.pojo.User;
import org.junit.Test;

import javax.print.event.PrintJobAttributeEvent;

import static org.junit.Assert.*;

public class UserDaoImplTest {
    private UserDao userDao = new UserDaoImpl();
    @Test
    public void addUser() {
        User user = new User("u123456","yxy","123456","男","成都市",null,"1748189762@qq.com","18582209278");
        userDao.addUser(user);
    }

    @Test
    public void queryUserByUid() {
//        User user = new User("u123456","yxy","123456","男","成都市",null,"1748189762@qq.com","18582209278");
        User user = userDao.queryUserByUid("u123456");
        System.out.println(user);
    }

    @Test
    public void login() {
//        User user = new User("u123456","yxy","123456","男","成都市",null,"1748189762@qq.com","18582209278");
        User user = userDao.login("yxy");
        System.out.println(user);
    }

    @Test
    public void updateUserInfo() {
        User yxy = userDao.login("yxy");
        yxy.setDescript("我很厉害");
        yxy.setEmail("1748189763");
        yxy.setUserMan("孙大圣");
        userDao.updateUserInfo(yxy.getUserid(),yxy);
    }

    @Test
    public void updatePassword() {
        User yxy = userDao.login("yxy");
        String userpassword = yxy.getUserpassword();
        String userid = yxy.getUserid();
        System.out.println(userpassword);
        userDao.updatePassword(userid,"111111");

        System.out.println(userpassword);
    }
}