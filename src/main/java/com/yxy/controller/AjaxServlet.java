package com.yxy.controller;

import com.google.gson.Gson;
import com.yxy.service.UserService;
import com.yxy.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "AjaxServlet", value = "/AjaxServlet")
public class AjaxServlet extends BaseServlet {
        private UserService userService = new UserServiceImpl();
        protected void ajaxExistsUsername(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            // 获取请求的参数username
            String username = req.getParameter("username");
            // 调用userService.existsUsername();
            boolean existsUsername = userService.exisetusername(username);
            // 把返回的结果封装成为map对象
            Map<String,Object> resultMap = new HashMap<>();
            resultMap.put("existsUsername",existsUsername);

            Gson gson = new Gson();
            String json = gson.toJson(resultMap);

            resp.getWriter().write(json);
        }
    }


