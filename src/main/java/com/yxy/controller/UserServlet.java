package com.yxy.controller;

import com.yxy.dao.UserDao;
import com.yxy.dao.impl.UserDaoImpl;
import com.yxy.pojo.User;
import com.yxy.service.UserService;
import com.yxy.service.impl.UserServiceImpl;
import com.yxy.utils.WebUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

@WebServlet(name = "UserServlet", value = "/UserServlet")
public class UserServlet extends BaseServlet {
    private UserService userService = new UserServiceImpl();
    UserDao userDao = new UserDaoImpl();

    protected void login(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    User user = userService.login(username,password);
    if(user!=null){
        request.getSession().setAttribute("user", user);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
    else {
        request.setAttribute("msg", "密码错误");
        request.getRequestDispatcher("/pages/user/login.jsp").forward(request,response);
    }
    }

    protected  void register(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        //获取Session中的验证码
        String toke = (String) request.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        //删除Session信息
        request.getSession().removeAttribute(KAPTCHA_SESSION_KEY);

        //1.获取请求参数

            String code = request.getParameter("code");

            //注册信息
            String userid="user"+System.currentTimeMillis();
            String username=request.getParameter("username");
            String password =request.getParameter("password");
            String uphone = request.getParameter("uphone");
            String email = request.getParameter("email");
            String sex = request.getParameter("gen");
            String uaddress =request.getParameter("uaddress");
            User user = new User(userid,username,password,sex,uaddress,null,email,uphone);
//        User user =  WebUtils.copyParamTOBean(request.getParameterMap(),new User());
            //检查验证码是否正确
        if(toke.equalsIgnoreCase(code)&&toke!=null){
            //判断用户名是否已经被使用,null者用户名可创建
            if(userService.exisetusername(username)){
                //调用service保存到数据库
                userService.register(user);
                //跳转到注册成功界面
                request.getRequestDispatcher("/pages/user/register_suc.jsp").forward(request,response);
            }
            else{
                System.out.println("用户名["+ code +"]已存在");

                request.setAttribute("msg","该用户名已注册");
                request.getRequestDispatcher("/pages/user/register.jsp").forward(request,response);
            }
        }
        else{
            System.out.println("验证码错误["+ code +"]");

            request.setAttribute("msg","验证码输入错误");
            request.setAttribute("username",user.getUsername());
            request.setAttribute("email",user.getEmail());
            request.getRequestDispatcher("/pages/user/register.jsp").forward(request,response);
        }
    }
        
    protected void updateInfo(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String uid = request.getParameter("uid");
        String userMan = request.getParameter("userMan");
        String uphone = request.getParameter("uphone");
        String uaddress = request.getParameter("uaddress");
        String email = request.getParameter("email");
        String descript = request.getParameter("descript");
        User user = (User)request.getSession().getAttribute("user");
        user.setUserMan(userMan);
        user.setEmail(email);
        user.setPhone(uphone);
        user.setAddress(uaddress);
        user.setDescript(descript);
        if( userService.updateUserInfo(uid,user)){
            request.setAttribute("msg","信息修改成功!");
            request.getSession().setAttribute("user",user);
            request.getRequestDispatcher("/pages/user/user_center.jsp").forward(request,response);
        }
        else {
            request.setAttribute("failMsg","信息修改失败");
            request.getRequestDispatcher("/pages/user/user_center.jsp").forward(request,response);

        }


    }
    protected void updatePassword(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

        String oldupwd = request.getParameter("oldupwd");
        String upwd = request.getParameter("upwd");
        String uid = request.getParameter("uid");
        User user = (User) request.getSession().getAttribute("user");
        if(oldupwd.equals(user.getUserpassword())){
            if(oldupwd.equals(upwd)){
                request.setAttribute("failMsg","修改密码时出现错误，前后密码不能重复");
                request.getRequestDispatcher("/pages/user/user_center.jsp").forward(request,response);
            }else{
                if(userService.updateUserPassword(uid, upwd)){
                    user.setUserpassword(upwd);
                    request.setAttribute("msg","密码修改成功!");
                    request.getSession().setAttribute("user",user);
                    request.getRequestDispatcher("/pages/user/user_center.jsp").forward(request,response);
                }
                else {
                    request.setAttribute("failMsg","系统出错了");
                    request.getRequestDispatcher("/pages/user/user_center.jsp").forward(request,response);
                }


            }
        }
        else {
            request.setAttribute("failMsg","修改密码时出现错误，请确认原密码是否正确");
            request.getRequestDispatcher("/pages/user/user_center.jsp").forward(request,response);
        }
    }

    protected void loginOut(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        request.getSession().removeAttribute("user");
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
