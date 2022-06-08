package com.yxy.pojo;

import java.util.Date;

public class User {

    private String userid;
    private String username;
    private String userpassword;
    private String sex;
    private String address;
    private Date birth;
    private String email;
    private String descript;
    private String userMan;

    public String getUserMan() {
        return userMan;
    }

    public void setUserMan(String userMan) {
        this.userMan = userMan;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", birth=" + birth +
                ", email='" + email + '\'' +
                ", descript='" + descript + '\'' +
                ", userMan='" + userMan + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public User(String userid, String username, String userpassword, String sex, String address, Date birth, String email, String descript, String userMan, String phone) {
        this.userid = userid;
        this.username = username;
        this.userpassword = userpassword;
        this.sex = sex;
        this.address = address;
        this.birth = birth;
        this.email = email;
        this.descript = descript;
        this.userMan = userMan;
        this.phone = phone;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    private String phone;
    public User() {
    }

    public User(String userid, String username, String userpassword, String sex, String address, Date birth, String email, String phone) {
        this.userid = userid;
        this.username = username;
        this.userpassword = userpassword;
        this.sex = sex;
        this.address = address;
        this.birth = birth;
        this.email = email;
        this.phone = phone;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

