package com.yxy.pojo;

import java.math.BigDecimal;

public class Store {
    private String storeId;
    private String storeName;
    private String account;
    private String password;
    private String storePhone;
    private String storeEmail;
    private String storeAddress;
    private String storeOwner;
    private String authentication;
    private BigDecimal margin;

    public Store() {
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeId='" + storeId + '\'' +
                ", storeName='" + storeName + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", storePhone='" + storePhone + '\'' +
                ", storeEmail='" + storeEmail + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", storeOwner='" + storeOwner + '\'' +
                ", authentication='" + authentication + '\'' +
                ", margin=" + margin +
                '}';
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public String getStoreEmail() {
        return storeEmail;
    }

    public void setStoreEmail(String storeEmail) {
        this.storeEmail = storeEmail;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStoreOwner() {
        return storeOwner;
    }

    public void setStoreOwner(String storeOwner) {
        this.storeOwner = storeOwner;
    }

    public String getAuthentication() {
        return authentication;
    }

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    public BigDecimal getMargin() {
        return margin;
    }

    public void setMargin(BigDecimal margin) {
        this.margin = margin;
    }

    public Store(String storeId, String storeName, String account, String password, String storePhone, String storeEmail, String storeAddress, String storeOwner, String authentication, BigDecimal margin) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.account = account;
        this.password = password;
        this.storePhone = storePhone;
        this.storeEmail = storeEmail;
        this.storeAddress = storeAddress;
        this.storeOwner = storeOwner;
        this.authentication = authentication;
        this.margin = margin;
    }
}

