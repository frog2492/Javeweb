package com.yxy.dao.impl;

import com.yxy.dao.OrderDao;
import com.yxy.pojo.Order;
import com.yxy.pojo.OrderItems;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class OrderDaoImplTest {
    private OrderDao orderDao = new OrderDaoImpl();
    @Test
    public void addOrder() {
        Order order = new Order();
        order.setOrderId("123456");
        order.setAddress("成都");
        order.setOrderState("已完成");
       order.setUserId("u123456");

        orderDao.addOrder(order);
    }

    @Test
    public void addOrderItem() {
        OrderItems orderItems = new OrderItems();
        orderItems.setItemId("1234");
        orderItems.setContenId("512");
        orderItems.setPrice(new BigDecimal("1200"));
        orderItems.setOrderId("2332");
        orderItems.setAmount(5);
        orderItems.setGoodsId("123");
        orderDao.addOrderItem(orderItems);
    }

    @Test
    public void queryOrderByUid() {
        List<Order> u123456 = orderDao.queryOrderByUid("u123456");
        System.out.println(u123456);

    }

    @Test
    public void queryOrderItemByUidAndOid() {
        List<OrderItems> orderItems = orderDao.queryOrderItemByUidAndOid("2332");
        System.out.println(orderItems);
    }

    @Test
    public void deleteOrder() {
        orderDao.deleteOrder("pet1654848996601");
    }

    @Test
    public void deleteOrderItem() {

    }

    @Test
    public void queryOrderByOstatus() {
        List<Order> s = orderDao.queryOrderByOstatus("已付款");
        System.out.println(s);
    }

    @Test
    public void updateOrderStatus() {
        orderDao.updateOrderStatus("pet1654868823173","运输中");
    }
}