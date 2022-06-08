package com.yxy.controller;

import com.yxy.pojo.Pet;
import com.yxy.service.PetService;
import com.yxy.service.impl.PetServiceImpl;
import com.yxy.utils.WebUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(name = "PetAdd", value = "/PetAdd")
public class PetAdd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        PetService petService = new PetServiceImpl();
        FileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        // 单个文件大小限制30M
        upload.setFileSizeMax(30 * 1024 * 1024);
        // 总文件大小限制 9OM
        upload.setSizeMax(90 * 1024 * 1024);
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
                    }else if("sex".equalsIgnoreCase(name)){
                        //中文转码
                        value = new String(value.getBytes("ISO-8859-1"),"UTF-8");

                        pet.setSex(value);
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
            pet.setStoreId("s10001");
            petService.addPet(pet);

        } catch (FileUploadException | ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //重定向到宠物管理列表
        response.sendRedirect(request.getContextPath()+"/StoreServlet?action=pet&pageNumber=1&pettype=0");
    }
}
