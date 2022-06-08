package com.yxy.service;

import com.yxy.pojo.Pet;
import com.yxy.pojo.PetType;

import java.util.List;

public interface PetService {
    Pet queryById(String id);
    List<Pet> queryAll();
    String queryVarietiesByTypeId(String typeId);
    List<PetType> queryAllPetTypeName();
    void updatePetInfo(Pet pet);
    void deletePet(String pid);
    void addPet(Pet pet);
    String queryVarietiesByTypeName(String typename);
    List<Pet> queryByType(String typeId);
}
