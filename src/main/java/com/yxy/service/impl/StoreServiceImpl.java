package com.yxy.service.impl;

import com.yxy.dao.StoreDao;
import com.yxy.dao.impl.StoreDaoImpl;
import com.yxy.pojo.Store;
import com.yxy.pojo.User;
import com.yxy.service.StoreService;

public class StoreServiceImpl implements StoreService {
    private StoreDao storeDao = new StoreDaoImpl();
    @Override
    public Store login(String account) {

        return storeDao.login(account);
    }
}

