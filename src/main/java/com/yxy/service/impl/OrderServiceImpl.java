package com.yxy.service.impl;

import com.yxy.dao.OrderDao;
import com.yxy.dao.PetDao;
import com.yxy.dao.impl.OrderDaoImpl;
import com.yxy.dao.impl.PetDaoImpl;
import com.yxy.pojo.Order;
import com.yxy.pojo.OrderItems;
import com.yxy.pojo.Pet;
import com.yxy.service.OrderService;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    private OrderDao orderDao =new OrderDaoImpl();
    private PetDao petDao = new PetDaoImpl();
    @Override
    public boolean addOrder(Order order) {
        try {
            orderDao.addOrder(order);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void addOrderItem(OrderItems orderItem) {
        try {
            orderDao.addOrderItem(orderItem);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Order> queryOrderByUid(String uid) {
        List<Order> orders=new ArrayList<>();
        try {
            orders=orderDao.queryOrderByUid(uid);
            for(int i=0;i<orders.size();i++)
            {
                orders.get(i).setItemList(orderDao.queryOrderItemByUidAndOid(orders.get(i).getOrderId()));
                for(int j=0;j<orders.get(i).getItemList().size();j++)
                {
                    orders.get(i).getItemList().get(j).setPet(petDao.queryById(orders.get(i).getItemList().get(j).getGoodsId()));
                }
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return orders;
    }


    @Override
    public List<OrderItems> queryOrderItemByUidAndOid(String oid) {
        try {
            List<OrderItems> orderItems = orderDao.queryOrderItemByUidAndOid(oid);
            return orderItems;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<OrderItems> queryAllItems() {
        try {
            List<OrderItems> orderItems = orderDao.queryAllItems();
            return orderItems;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void updateOrderStatus(String oid, String ostatus) {
        orderDao.updateOrderStatus(oid,ostatus);
    }

    @Override
    public void deleteOrder(String oid) {
        try {
            orderDao.deleteOrder(oid);
            orderDao.deleteOrder(oid);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Order> queryOrderByOstatus(String ostatus) {
        List<Order> orders=new ArrayList<>();
        try {
            orders=orderDao.queryOrderByOstatus(ostatus);
            for(int i=0;i<orders.size();i++)
            {
                orders.get(i).setItemList(orderDao.queryOrderItemByUidAndOid(orders.get(i).getOrderId()));
                for(int j=0;j<orders.get(i).getItemList().size();j++)
                {
                    orders.get(i).getItemList().get(j).setPet(petDao.queryById(orders.get(i).getItemList().get(j).getGoodsId()));
                }
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return orders;
    }

    @Override
    public List<Order> queryOrder() {
        List<Order> orders=new ArrayList<>();
        try {
            orders=orderDao.queryOrder();
            for(int i=0;i<orders.size();i++)
            {
                orders.get(i).setItemList(orderDao.queryOrderItemByUidAndOid(orders.get(i).getOrderId()));
                for(int j=0;j<orders.get(i).getItemList().size();j++)
                {
                    orders.get(i).getItemList().get(j).setPet(petDao.queryById(orders.get(i).getItemList().get(j).getGoodsId()));
                }
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return orders;
    }
}


