package com.yxy.service.impl;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.yxy.pojo.Pet;
import com.yxy.service.PetService;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PetServiceImplTest {
    private PetService petService = new PetServiceImpl();
    @Test
    public void queryById() {
        Pet pet = petService.queryById("12346");
        Pet pet1001 = petService.queryById("pet1001");
        System.out.println(pet);
        System.out.println(pet1001);
    }

    @Test
    public void queryAll() {
        List<Pet> pets =  petService.queryAll();
        System.out.println(pets);
    }

    @Test
    public void queryVarietiesByTypeId() {
        String pt10001 = petService.queryVarietiesByTypeId("pt10001");
        System.out.println(pt10001);
    }
}