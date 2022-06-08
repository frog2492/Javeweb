package com.yxy.controller;

import com.yxy.pojo.Pet;
import com.yxy.pojo.PetType;
import com.yxy.service.PetService;
import com.yxy.service.impl.PetServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(name = "InterfaceServlet", value = "/InterfaceServlet")
public class InterfaceServlet extends BaseServlet {
    PetService petService = new PetServiceImpl();
  protected void ShowIndex(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
      List<Pet> pets = petService.queryAll();
      List<PetType> petTypes = petService.queryAllPetTypeName();
      request.setAttribute("type", petTypes);
      request.getSession().setAttribute("petType",petTypes);
      request.setAttribute("pets", pets);
      request.getRequestDispatcher("pages/client/index.jsp").forward(request,response);

  }

    protected void ShowPetInfo(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        Pet pet = petService.queryById(request.getParameter("bid"));
        List<PetType> petTypes = petService.queryAllPetTypeName();
        DateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date birthday = pet.getBirthday();
            String format = dft.format(birthday);
            //猫咪出生时间
            Date star = dft.parse(format);
            //当前时间
            String format1 = dft.format(new Date());
            Date endDay=dft.parse(format1);
            Long starTime=star.getTime();
            Long endTime=endDay.getTime();
            //时间戳相差的毫秒数
            Long num=endTime-starTime;
            //除以一天的毫秒数
            long l = num / 24 / 60 / 60 / 1000;
           request.setAttribute("age",l);
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.setAttribute("type", petTypes);
        request.setAttribute("pet", pet);
        request.getRequestDispatcher("pages/client/pet_detail.jsp").forward(request,response);
    }
    protected void ByTypeShowInfo(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String typeId = request.getParameter("typeId");
        if("-1".equals(typeId)){
            List<Pet> pets = petService.queryAll();

            request.setAttribute("pets",pets);
            request.getRequestDispatcher("pages/client/pettypes_list.jsp").forward(request,response);

        }else{
            List<Pet> pets = petService.queryByType(typeId);
            String s = petService.queryVarietiesByTypeId(typeId);
            request.setAttribute("t",s);
            request.setAttribute("pets",pets);
            request.getRequestDispatcher("pages/client/pettypes_list.jsp").forward(request,response);
        }
    }
}
