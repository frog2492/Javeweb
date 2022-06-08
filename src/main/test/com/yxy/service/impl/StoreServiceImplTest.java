package com.yxy.service.impl;

import com.yxy.pojo.Store;
import com.yxy.service.StoreService;
import com.yxy.service.UserService;
import org.junit.Test;

import static org.junit.Assert.*;

public class StoreServiceImplTest {
    private StoreService userService = new StoreServiceImpl();
    @Test
    public void login() {
        Store sto11111 = userService.login("sto11111");
        System.out.println(sto11111);
    }
}