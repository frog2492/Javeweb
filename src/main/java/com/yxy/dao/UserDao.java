package com.yxy.dao;

import com.yxy.pojo.User;

import java.util.List;

public interface UserDao {
    public int addUser(User user);
    public void updateUserInfo(String uid, User user);
    public void updatePassword(String uid,String upwd);
    public User login(String uname );
    public User queryUserByUid(String uid);
}
