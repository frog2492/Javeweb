package com.yxy.pojo;

import java.math.BigDecimal;

public class OrderItems {
    private String itemId;
    private String contenId;
    private String goodsId;
    private Integer amount;
    private String orderId;
    private BigDecimal price;
    private Order order;
    private Pet pet;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderItems() {
    }

    public OrderItems(String itemId, String contenId, String goodsId, Integer amount, String orderId, BigDecimal price) {
        this.itemId = itemId;
        this.contenId = contenId;
        this.goodsId = goodsId;
        this.amount = amount;
        this.orderId = orderId;
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderItems{" +
                "itemId='" + itemId + '\'' +
                ", contenId='" + contenId + '\'' +
                ", goodsId='" + goodsId + '\'' +
                ", amount=" + amount +
                ", orderId='" + orderId + '\'' +
                ", price=" + price +
                '}';
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getContenId() {
        return contenId;
    }

    public void setContenId(String contenId) {
        this.contenId = contenId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

