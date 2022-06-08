package com.yxy.dao.impl;

import com.yxy.dao.StoreDao;
import com.yxy.pojo.Store;
import org.junit.Test;

import static org.junit.Assert.*;

public class StoreDaoImplTest {
    private StoreDao storeDao = new StoreDaoImpl();
    @Test
    public void login() {
        Store login = storeDao.login("sto11111");
        System.out.println(login);
    }
}