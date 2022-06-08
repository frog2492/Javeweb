package com.yxy.service;

import com.yxy.pojo.User;

public interface UserService {
    User login(String uname, String password);

    void register(User user);

    boolean exisetusername(String uname);

    boolean updateUserInfo(String uid,User user);

    boolean updateUserPassword(String uid,String password);
}
