package com.yxy.controller;


import com.yxy.pojo.Order;
import com.yxy.pojo.Pet;
import com.yxy.pojo.PetType;
import com.yxy.service.OrderService;
import com.yxy.service.PetService;
import com.yxy.service.StoreService;
import com.yxy.service.impl.OrderServiceImpl;
import com.yxy.service.impl.PetServiceImpl;
import com.yxy.service.impl.StoreServiceImpl;
import com.yxy.utils.WebUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@WebServlet(name = "StoreServlet", value = "/StoreServlet")
public class StoreServlet extends BaseServlet{
    private StoreService storeService= new StoreServiceImpl();
    private PetService petService = new PetServiceImpl();
    private OrderService orderService = new OrderServiceImpl();
    protected void  login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        storeService.login(account);

        if(account!=null&&password.equals( storeService.login(account).getPassword())){
            request.getRequestDispatcher("/pages/store/index.jsp").forward(request,response);
        }
        else {
            request.setAttribute("msg", "请检查你的账号和密码是否正确");
            request.getRequestDispatcher("/pages/store/login.jsp").forward(request,response);
        }


    }
    protected void  pet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pettype = request.getParameter("pettype");
        request.setAttribute("pettype",pettype);
        List<Pet> pets = petService.queryAll();
        request.setAttribute("pets",pets);
        if(pettype.equals("-1")){

            request.getRequestDispatcher("/pages/store/pet_list.jsp").forward(request,response);

        }
       else if(pettype.equals("0")){
            String typeId = request.getParameter("typeId");
            petService.queryById(typeId);

            request.getRequestDispatcher("/pages/store/pet_list.jsp").forward(request,response);
        }

    }

    protected void  petUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pid = request.getParameter("pid");
        Pet pet = petService.queryById(pid);
        request.setAttribute("pet",pet);
        request.setAttribute("typeName",petService.queryVarietiesByTypeId(pet.getType()));
        List<PetType> petTypes = petService.queryAllPetTypeName();
        request.setAttribute("petTypes",petTypes);
        request.getRequestDispatcher("/pages/store/pet_edit.jsp").forward(request,response);
    }
    //使用PetUpdat代替
    public void  UpdateInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        FileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        // 单个文件大小限制10M
        upload.setFileSizeMax(10 * 1024 * 1024);
        // 总文件大小限制 5OM
        upload.setSizeMax(50 * 1024 * 1024);
        // 对中文文件编码处理
        upload.setHeaderEncoding("UTF-8");
        Pet pet = new Pet();

        try {
            List<FileItem> fileItemList = upload.parseRequest(request);

            for (FileItem fileItem : fileItemList) {
                //普通表单
                if (fileItem.isFormField()) {
                    String name = fileItem.getFieldName();
                    String value = fileItem.getString();
                    if("pid".equalsIgnoreCase(name)){
                        pet.setPetId(value);
                    }
                    if("birthday".equalsIgnoreCase(name)){
                        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                        Date birthday = df.parse(value);
                        pet.setBirthday(birthday);
                    } else if("weight".equalsIgnoreCase(name)){
                        pet.setWeight(new Float(value));

                    }else if("price".equalsIgnoreCase(name)){

                        pet.setPrice( new BigDecimal(value));

                    }else if("type".equalsIgnoreCase(name)){

                        pet.setType(value);
                    }else if("pin".equalsIgnoreCase(name)){
                        pet.setPin(WebUtils.parseInt(value,0));
                    }else if("desc".equalsIgnoreCase(name)){
                        //中文转码
                        value = new String(value.getBytes("ISO-8859-1"),"UTF-8");

                        pet.setDescribe(value);
                    }

                }
                else {
                    if(fileItem.getInputStream().available()<=0) {
                        continue;
                    }
                    String fileName = fileItem.getName();
                    fileName = fileName.substring(fileName.lastIndexOf("."));
                    fileName = "/"+System.currentTimeMillis()+fileName;
                    String path = request.getServletContext().getRealPath("images")+fileName;
                    InputStream in = fileItem.getInputStream();
                    FileOutputStream out = new FileOutputStream(path);
                    byte[] buffer = new byte[1024];
                    int len=0;
                    while( (len=in.read(buffer))>0 ) {
                        out.write(buffer);
                    }
                    in.close();
                    out.close();
                    fileItem.delete();
                    switch(fileItem.getFieldName()) {
                        case "img1":
                            pet.setPicture(fileName);
                            break;
                        case "img2":
                            pet.setPicture1(fileName);
                            break;
                        case "img3":
                            pet.setPicture2(fileName);
                            break;
                    }
                }

            }



            //保存宠物信息至数据库
            petService.updatePetInfo(pet);

        } catch (FileUploadException | ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //重定向到宠物管理列表
        response.sendRedirect(request.getContextPath()+"/StoreServlet?action=pet&pageNumber=1&pettype=0");
    }

    protected void  petDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {

        petService.deletePet(  request.getParameter("pid"));
        response.sendRedirect(request.getContextPath()+"/StoreServlet?action=pet&pageNumber=1&pettype=0");
    }
    protected void addPet(HttpServletRequest request ,HttpServletResponse response) throws ServletException, IOException {
        List<PetType> petTypes = petService.queryAllPetTypeName();
        request.setAttribute("petTypes",petTypes);
        request.getRequestDispatcher("/pages/store/pet_add.jsp").forward(request,response);
    }
    protected void showOrder(HttpServletRequest request ,HttpServletResponse response) throws ServletException, IOException {
        String ostatus = request.getParameter("ostatus");
        if("1".equals(ostatus)){
            List<Order> orders = orderService.queryOrder();
            request.setAttribute("orders",orders);
            request.getRequestDispatcher("pages/store/order_list.jsp").forward(request,response);
        }
        else if("2".equals(ostatus)){
            List<Order> orders = orderService.queryOrderByOstatus("已付款");
            request.setAttribute("orders",orders);
            request.getRequestDispatcher("pages/store/order_list.jsp").forward(request,response);
        }
        else if("3".equals(ostatus)){
            List<Order> orders = orderService.queryOrderByOstatus("运输中");
            request.setAttribute("orders",orders);
            request.getRequestDispatcher("pages/store/order_list.jsp").forward(request,response);
        }
        else if("4".equals(ostatus)){
            List<Order> orders = orderService.queryOrderByOstatus("已完成");
            request.setAttribute("orders",orders);
            request.getRequestDispatcher("pages/store/order_list.jsp").forward(request,response);
        }
        else{
            request.getRequestDispatcher("pages/store/order_list.jsp").forward(request,response);
        }
    }
        protected void deleteOrder(HttpServletRequest request ,HttpServletResponse response) throws IOException {
            String oid = request.getParameter("oid");
            orderService.deleteOrder(oid);
            response.sendRedirect(request.getContextPath()+"/StoreServlet?action=showOrder&pageNumber=1&ostatus=1");
        }

    protected void changeState(HttpServletRequest request ,HttpServletResponse response) throws IOException {
        String oid = request.getParameter("oid");
        String ostatus = request.getParameter("ostatus");
        if("3".equals(ostatus)){
            orderService.updateOrderStatus(oid,"运输中" );
            response.sendRedirect(request.getContextPath()+"/StoreServlet?action=showOrder&pageNumber=1&ostatus=3");
        }
        else if("4".equals(ostatus)){
            orderService.updateOrderStatus(oid,"已完成" );
            response.sendRedirect(request.getContextPath()+"/StoreServlet?action=showOrder&pageNumber=1&ostatus=4");
        }



    }
    protected void loginout(HttpServletRequest request ,HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
    }



