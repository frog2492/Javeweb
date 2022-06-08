package com.yxy.service.impl;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.yxy.dao.UserDao;
import com.yxy.dao.impl.UserDaoImpl;
import com.yxy.pojo.User;
import com.yxy.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao= new UserDaoImpl();
    @Override
    public User login(String uname,String password){
        User login = userDao.login(uname);
        if(login!=null&&login.getUserpassword().equals(password)){
            return login;
        }

        return null;
    }

    @Override
    public void register(User user) {

        userDao.addUser(user);
    }

    @Override
    public boolean exisetusername(String uname) {

        if( userDao.login(uname)!=null){
            return false;
        }

         return true;

    }

    @Override
    public boolean updateUserInfo(String uid, User user) {

        try {
            userDao.updateUserInfo(uid,user);
            return true;
        } catch (Exception e) {

            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateUserPassword(String uid, String password) {

        try {
            userDao.updatePassword(uid,password);
            return true;
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
            return false;

        }
    }


}

