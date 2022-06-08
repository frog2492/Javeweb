package com.yxy.dao;

import com.yxy.pojo.Pet;
import com.yxy.pojo.PetType;

import java.util.List;

public interface PetDao {
    Pet queryById(String id);

    /**
     * 查询所有宠物信息
     * @return
     */
    List<Pet> queryAll();

    String queryVarietiesByTypeId(String typeId);
    String queryVarietiesByTypeName(String typename);
    List<PetType> queryAllPetTypeName();
    void deletePet(String pid);
    void updatePetInfo(Pet pet);
    void addPet(Pet pet);
    List<Pet> queryByType(String typeId);
}
