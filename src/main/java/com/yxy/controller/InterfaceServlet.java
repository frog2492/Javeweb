package com.yxy.controller;

import com.yxy.pojo.Page;
import com.yxy.pojo.Pet;
import com.yxy.pojo.PetType;
import com.yxy.service.PetService;
import com.yxy.service.impl.PetServiceImpl;
import com.yxy.utils.WebUtils;

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
      Page<Pet> page = petService.queryPets("-1", 1);
      List<Pet> pets = page.getItems();
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
        Integer pageNumber = WebUtils.parseInt(request.getParameter("pageNumber"),1);
        request.setAttribute("type", typeId);

        if("-1".equals(typeId)){
            Page<Pet> page = petService.queryPets(typeId, pageNumber);
            page.setUrl("InterfaceServlet?action=ByTypeShowInfo");
            request.setAttribute("p",page);
            List<Pet> items = page.getItems();
            request.setAttribute("pets",items);
            request.getRequestDispatcher("pages/client/pettypes_list.jsp").forward(request,response);

        }else{
            Page<Pet> page = petService.queryPets(typeId, pageNumber);
            List<Pet> items = page.getItems();
            page.setUrl("InterfaceServlet?action=ByTypeShowInfo");
            String s = petService.queryVarietiesByTypeId(typeId);
            request.setAttribute("t",s);
            request.setAttribute("p",page);
            request.setAttribute("pets",items);
            request.getRequestDispatcher("pages/client/pettypes_list.jsp").forward(request,response);
        }
    }
}
