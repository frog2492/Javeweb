package com.yxy.service.impl;

import com.yxy.pojo.User;
import com.yxy.service.UserService;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceImplTest {
    private UserService userService = new UserServiceImpl();
    @Test
    public void login() {
        User user = userService.login("yxy", "1238456");
        System.out.println(user);
    }
    @Test
    public void register() {
        userService.register(new User("u123446","100","123456","男","成都市",null,"1748189762@qq.com","18582209278"));

    }
    @Test
    public void exsist(){
        boolean yxy = userService.exisetusername("xy");
        System.out.println(yxy);
    }
}