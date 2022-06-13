package com.yxy.dao.impl;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.yxy.dao.OrderDao;
import com.yxy.pojo.Order;
import com.yxy.pojo.OrderItems;

import java.util.List;

public class OrderDaoImpl extends BaseDao implements OrderDao {
    @Override
    public void addOrder(Order order) {
        String sql = "insert into `order`(order_id,user_id,order_date,order_sate,totalprice,consignee,paytype,address,phone,number) values(?,?,?,?,?,?,?,?,?,?)";
        update(sql,order.getOrderId(),order.getUserId(),order.getCreateDate(),order.getOrderState(),order.getTotalPrice(),order.getConsignee(),order.getPayType(),order.getAddress(),order.getPhone(),order.getNumber());
    }

    @Override
    public void addOrderItem(OrderItems orderItem) {
    String sql = "insert into orderitem(item_id,contentid,g_id,amount,order_id,price) values(?,?,?,?,?,?)";
    update(sql,orderItem.getItemId(),orderItem.getContenId(),orderItem.getGoodsId(),orderItem.getAmount(),orderItem.getOrderId(),orderItem.getPrice());


    }

    @Override
    public void deleteOrder(String oid) {
    String sql="  delete from `order` where order_id=?";
    update(sql,oid);
    }

    @Override
    public void deleteOrderItem(String oid) {
        String sql="  delete from `orderitem` where order_id=?";
        update(sql,oid);
    }

    @Override
    public List<Order> queryOrderByUid(String uid) {
        String sql="select order_id orderId,user_id userId,order_date createDate,order_sate orderState,totalprice totalPrice,consignee consignee,paytype payType,address address,phone Phone,number number from `order` where user_id=? ";
        return queryForList(Order.class,sql,uid);
    }

    @Override
    public List<OrderItems> queryOrderItemByUidAndOid(String oid) {
        String sql="select item_id itemId,contentid contenId,g_id goodsId,amount,order_id orderId,price from orderitem where order_id=?";

        return queryForList(OrderItems.class, sql, oid);
    }

    @Override
    public List<OrderItems> queryAllItems() {
        String sql="select item_id itemId,contentid contenId,g_id goodsId,amount,order_id orderId,price from orderitem";

        return queryForList(OrderItems.class, sql);
    }

    @Override
    public List<Order> queryOrder() {
        String sql="select order_id orderId,user_id userId,order_date createDate,order_sate orderState,totalprice totalPrice,consignee consignee,paytype payType,address address,phone Phone,number number from `order` ";
        return queryForList(Order.class,sql);
    }


    @Override
    public List<Order> queryOrder(int pageIndex, int pageSize) {
        return null;
    }

    @Override
    public int queryCountOfOrder() {
        return 0;
    }

    @Override
    public List<Order> queryOrderByOstatus(String ostatus) {
        String sql="select order_id orderId,user_id userId,order_date createDate,order_sate orderState,totalprice totalPrice,consignee consignee,paytype payType,address address,phone Phone,number number from `order` where order_sate=? ";
        return queryForList(Order.class, sql, ostatus);
    }

    @Override
    public int queryCountOfOrderByOstatus(String ostatus) {
        return 0;
    }

    @Override
    public void updateOrderStatus(String oid, String ostatus) {
        String sql ="update `order` set order_sate=? where order_id=?";
        update(sql,ostatus,oid);

    }
}

