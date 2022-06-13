package com.yxy.dao;

import com.yxy.pojo.Order;
import com.yxy.pojo.OrderItems;

import javax.swing.*;
import java.util.List;

public interface OrderDao {
    public void addOrder(Order order);
    public void addOrderItem(OrderItems orderItem);
    public void deleteOrder(String oid);
    public void deleteOrderItem(String oid);

    public List<Order> queryOrderByUid(String uid);
    public List<OrderItems> queryOrderItemByUidAndOid(String oid);
    public List<OrderItems> queryAllItems();
    public List<Order> queryOrder();
    public List<Order> queryOrder(int pageIndex,int pageSize);
    public int queryCountOfOrder();

    public List<Order> queryOrderByOstatus(String ostatus);

    public int queryCountOfOrderByOstatus(String ostatus);
    public void updateOrderStatus(String oid,String ostatus);
}
