package com.yxy.dao.impl;

import com.sun.javafx.binding.StringFormatter;
import com.yxy.dao.StoreDao;
import com.yxy.pojo.Store;

public class StoreDaoImpl extends BaseDao implements StoreDao {
    @Override
    public Store login(String account) {
        String sql = "select store_account account,store_password password from store where store_account=? ";

        return queryForOne(Store.class, sql,account);
    }

}

