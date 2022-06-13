package com.yxy.controller;

import com.yxy.pojo.Pet;
import com.yxy.service.PetService;
import com.yxy.service.impl.PetServiceImpl;
import com.yxy.utils.WebUtils;

import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CartServlet", value = "/CartServlet")
public class CartServlet extends BaseServlet {
    PetService petService = new PetServiceImpl();
    protected void addPetItem(HttpServletRequest request,HttpServletResponse response) throws IOException {



    }
}
