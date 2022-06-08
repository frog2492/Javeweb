package com.yxy.dao;

import com.yxy.pojo.User;

import java.util.List;

public interface UserDao {
    public int addUser(User user);
    public int identify(String uname);
    public void updateUserInfo(String uid, User user);
    public void updatePassword(String uid,String upwd);
    public int getUidByUname(String uname);
    public User login(String uname );
    public String queryUpwd(int uid);
    public List<User> queryUser(int pageIndex, int pageSize);
    public int queryCountOfUser();
    public void deleteUser(int uid);
    public User queryUserByUid(String uid);
}
