package com.yxy.pojo;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private String orderId;
    private String userId;
    private LocalDateTime createDate;
    private String orderState;
    private BigDecimal totalPrice;
    private String consignee;
    private Integer payType;
    private String address;
    private Integer number;
    private String Phone;
    private List<OrderItems> itemList = new ArrayList<OrderItems>();
    public Order() {
    }

    public List<OrderItems> getItemList() {
        return itemList;
    }

    public void setItemList(List<OrderItems> itemList) {
        this.itemList = itemList;
    }

    public Order(String orderId, String userId, LocalDateTime createDate, String orderState, BigDecimal totalPrice, String consignee, Integer payType, String address, Integer number, String phone, List<OrderItems> itemList) {
        this.orderId = orderId;
        this.userId = userId;
        this.createDate = createDate;
        this.orderState = orderState;
        this.totalPrice = totalPrice;
        this.consignee = consignee;
        this.payType = payType;
        this.address = address;
        this.number = number;
        Phone = phone;
        this.itemList = itemList;
    }

    public Order(String orderId, String userId, LocalDateTime createDate, String orderState, BigDecimal totalPrice, String consignee, Integer payType, String address, Integer number, String phone) {
        this.orderId = orderId;
        this.userId = userId;
        this.createDate = createDate;
        this.orderState = orderState;
        this.totalPrice = totalPrice;
        this.consignee = consignee;
        this.payType = payType;
        this.address = address;
        this.number = number;
        Phone = phone;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId='" + userId + '\'' +
                ", createDate=" + createDate +
                ", orderState='" + orderState + '\'' +
                ", totalPrice=" + totalPrice +
                ", consignee='" + consignee + '\'' +
                ", payType=" + payType +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", Phone='" + Phone + '\'' +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}

