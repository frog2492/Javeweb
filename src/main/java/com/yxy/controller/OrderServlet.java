package com.yxy.controller;

import com.yxy.pojo.Order;
import com.yxy.pojo.OrderItems;
import com.yxy.pojo.Pet;
import com.yxy.pojo.User;
import com.yxy.service.OrderService;
import com.yxy.service.PetService;
import com.yxy.service.impl.OrderServiceImpl;
import com.yxy.service.impl.PetServiceImpl;
import com.yxy.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.channels.NonReadableChannelException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@WebServlet(name = "OrderServlet", value = "/OrderServlet")
public class OrderServlet extends BaseServlet {
    PetService petService = new PetServiceImpl();
    OrderService orderService = new OrderServiceImpl();
    Order order =new Order();
    protected void showCreatOrder(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String pid = request.getParameter("pid");
        Pet pet = petService.queryById(pid);
        User user = (User) request.getSession().getAttribute("user");
        if(user!=null){
            request.setAttribute("pet",pet);
            request.getRequestDispatcher("pages/info/order_submit.jsp").forward(request,response);

        }
        else {
            request.getRequestDispatcher("pages/user/login.jsp").forward(request, response);
        }
    }

    protected void creatOrder(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        String orderId = "pet"+System.currentTimeMillis();
        String orderState="已付款";
        String paytype = request.getParameter("paytype");
        String consignee = request.getParameter("consignee");
        LocalDateTime localDateTime = LocalDateTime.now();
        User user = (User) request.getSession().getAttribute("user");
        order.setUserId(user.getUserid());
        order.setCreateDate(localDateTime);
        order.setOrderId(orderId);
        order.setOrderState(orderState);
        order.setPayType(WebUtils.parseInt(paytype,1));
        order.setTotalPrice(new BigDecimal(request.getParameter("price")));
        order.setConsignee(consignee);
        order.setPhone(request.getParameter("phone"));
        order.setNumber(1);
        order.setAddress(request.getParameter("address"));

        if(orderService.addOrder(order))
        {
            String itemId ="item"+System.currentTimeMillis();
            String petId = request.getParameter("petId");
            String price = request.getParameter("price");
            OrderItems orderItems = new OrderItems();
            orderItems.setItemId(itemId);
            orderItems.setGoodsId(petId);
            orderItems.setAmount(1);
            orderItems.setPrice(new BigDecimal(price));
            orderItems.setOrderId(orderId);
            orderService.addOrderItem(orderItems);
            request.setAttribute("msg", "订单支付成功！");
           request.getRequestDispatcher("pages/info/order_result.jsp").forward(request,response);
        }
        else
        {
            request.setAttribute("failmsg", "订单支付失败！");
            request.getRequestDispatcher("pages/info/order_result.jsp").forward(request,response);
        }
    }
    protected void showOrderList(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        User user = (User) request.getSession().getAttribute("user");

        List<Order> orders = orderService.queryOrderByUid(user.getUserid());


        request.setAttribute("orders",orders);
        request.getRequestDispatcher("pages/info/order_list.jsp").forward(request,response);

    }
}
