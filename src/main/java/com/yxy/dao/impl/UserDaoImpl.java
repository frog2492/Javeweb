package com.yxy.dao.impl;

import com.yxy.dao.UserDao;
import com.yxy.pojo.User;

import java.util.List;

public class UserDaoImpl  extends BaseDao implements UserDao{

    @Override
    public int addUser(User user) {
        String sql="insert into user(user_id,user_name,user_password,user_sex,address,email,phone) values(?,?,?,?,?,?,?)";
        return update(sql,user.getUserid(),user.getUsername(),user.getUserpassword(),user.getSex(),user.getAddress(),user.getEmail(),user.getPhone());
    }

    @Override
    public int identify(String uname) {
        return 0;
    }

    @Override
    public void updateUserInfo(String uid, User user) {
        String sql = "update user set address=?,email=?,phone=?,`describe`=?,userman=? where user_id=?";
        update(sql, user.getAddress(),user.getEmail(),user.getPhone(),user.getDescript(),user.getUserMan(),user.getUserid());
    }

    @Override
    public void updatePassword(String uid, String upwd) {
    String sql = "update user set user_password=? where user_id=?";
    update(sql, upwd,uid);
    }

    @Override
    public int getUidByUname(String uname) {
        return 0;
    }

    @Override
    public User login(String uname) {
        String sql="select user_id userid,user_name username,user_password userpassword,user_sex sex,address,email,phone,userman userMan,`describe` descript from user where user_name=? ";
        return queryForOne(User.class,sql,uname);
    }

    @Override
    public String queryUpwd(int uid) {
        return null;
    }

    @Override
    public List<User> queryUser(int pageIndex, int pageSize) {
        return null;
    }

    @Override
    public int queryCountOfUser() {
        return 0;
    }

    @Override
    public void deleteUser(int uid) {

    }

    @Override
    public User queryUserByUid(String uid) {
        String sql="select user_id userid,user_name username,user_password userpassword,user_sex sex,address,email,phone from user where user_id=? ";

        return queryForOne(User.class,sql,uid);
    }
}

