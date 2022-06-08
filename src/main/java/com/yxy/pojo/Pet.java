package com.yxy.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Pet {
    private String petId;
    private String sex;
    private String type;
    private String describe;
    private Float weight;
    private Date birthday;
    private String picture;
    private String picture1;
    private String picture2;
    private BigDecimal price;
    private Integer pin;
    private String  StoreId;
    public Pet(String petId, String sex, String type, String describe, Float weight, Date birthday, String picture, String picture1, String picture2, BigDecimal price, Integer pin, String storeId) {
        this.petId = petId;
        this.sex = sex;
        this.type = type;
        this.describe = describe;
        this.weight = weight;
        this.birthday = birthday;
        this.picture = picture;
        this.picture1 = picture1;
        this.picture2 = picture2;
        this.price = price;
        this.pin = pin;
        StoreId = storeId;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petId='" + petId + '\'' +
                ", sex='" + sex + '\'' +
                ", type='" + type + '\'' +
                ", describe='" + describe + '\'' +
                ", weight=" + weight +
                ", birthday=" + birthday +
                ", picture='" + picture + '\'' +
                ", picture1='" + picture1 + '\'' +
                ", picture2='" + picture2 + '\'' +
                ", price=" + price +
                ", pin=" + pin +
                ", StoreId='" + StoreId + '\'' +
                '}';
    }

    public String getPicture1() {
        return picture1;
    }

    public void setPicture1(String picture1) {
        this.picture1 = picture1;
    }

    public String getPicture2() {
        return picture2;
    }

    public void setPicture2(String picture2) {
        this.picture2 = picture2;
    }

    public Pet() {
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public String getStoreId() {
        return StoreId;
    }

    public void setStoreId(String storeId) {
        StoreId = storeId;
    }

    public Pet(String petId, String sex, String type, String describe, Float weight, Date birthday, String picture, BigDecimal price, Integer pin, String storeId) {
        this.petId = petId;
        this.sex = sex;
        this.type = type;
        this.describe = describe;
        this.weight = weight;
        this.birthday = birthday;
        this.picture = picture;
        this.price = price;
        this.pin = pin;
        StoreId = storeId;
    }
}

