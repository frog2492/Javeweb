package com.yxy.dao.impl;

import com.yxy.dao.PetDao;
import com.yxy.pojo.Pet;
import com.yxy.pojo.PetType;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PetDaoImplTest {
    private PetDao petDao = new PetDaoImpl();
    @Test
    public void queryById() {
        Pet pet = petDao.queryById("pet1001");
        System.out.println(pet);
    }

    @Test
    public void queryAll() {
        List<Pet> pets = petDao.queryAll();

        System.out.println(pets);
        for(Pet item:pets){
            String describe = item.getDescribe();
            System.out.println(describe);

            System.out.println(item);
        }

    }

    @Test
    public void queryVarietiesByTypeId() {
        String pt0001 = petDao.queryVarietiesByTypeId("pt0001");
        System.out.println(pt0001);
    }

    @Test
    public void queryAllPetTypeName() {
        List<PetType> petTypes = petDao.queryAllPetTypeName();
        System.out.println(petTypes);
    }

    @Test
    public void updatePetInfo() {
        Pet pet = petDao.queryById("pet1001");
        pet.setSex("雌性");
        pet.setWeight(new Float(4.2));
        petDao.updatePetInfo(pet);
    }

    @Test
    public void queryVarietiesByTypeName() {
        String s = petDao.queryVarietiesByTypeName("波斯猫");
        System.out.println(s);
    }

    @Test
    public void addPet() {
        Pet pet = petDao.queryById("pet1001");
        pet.setPetId("pet1005");
        petDao.addPet(pet);
    }

    @Test
    public void queryByType() {

        System.out.println(  petDao.queryByType("pt0007"));
    }

    @Test
    public void queryPets() {
        List<Pet> pets = petDao.queryPets(0, 4);
        System.out.println(pets);
    }

    @Test
    public void queryCountOfPets() {
        int i = petDao.queryCountOfPets();
        System.out.println(i);
    }

    @Test
    public void queryCountByType() {
        int i = petDao.queryCountByType("pt0007");
        System.out.println(i);
    }

    @Test
    public void testQueryByType() {
        List<Pet> pt0007 = petDao.queryByType("-1", 0, 8);
        for(Pet pet:pt0007){
            System.out.println(pet);
        }
//        System.out.println(pt0007);
    }
}