package com.yxy.service;

import com.yxy.pojo.Order;
import com.yxy.pojo.OrderItems;

import java.util.List;

public interface OrderService {
    public boolean addOrder(Order order);
    public void addOrderItem(OrderItems orderItem);
    public List<Order> queryOrderByUid(String uid);
    public List<OrderItems> queryOrderItemByUidAndOid(String oid);
    List<OrderItems> queryAllItems();
    public void updateOrderStatus(String oid,String ostatus);
    public void deleteOrder(String oid);
    public List<Order> queryOrderByOstatus(String ostatus);
    public List<Order> queryOrder();
}
