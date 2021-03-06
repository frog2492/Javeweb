package com.yxy.service.impl;

import com.yxy.dao.PetDao;
import com.yxy.dao.impl.PetDaoImpl;
import com.yxy.pojo.Page;
import com.yxy.pojo.Pet;
import com.yxy.pojo.PetType;
import com.yxy.service.PetService;

import java.util.List;

public class PetServiceImpl implements PetService {
    private PetDao petDao = new PetDaoImpl();
    @Override
    public Pet queryById(String id) {

        try {
            return petDao.queryById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Pet> queryAll() {

        try {
            return petDao.queryAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public String queryVarietiesByTypeId(String typeId) {
        try {
            return petDao.queryVarietiesByTypeId(typeId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
}

    @Override
    public List<PetType> queryAllPetTypeName() {
        try {
            return petDao.queryAllPetTypeName();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void updatePetInfo(Pet pet) {
        petDao.updatePetInfo(pet);
    }

    @Override
    public void deletePet(String pid) {
        petDao.deletePet(pid);
    }

    @Override
    public void addPet(Pet pet) {

        petDao.addPet(pet);
    }

    @Override
    public String queryVarietiesByTypeName(String typename) {
        try {
            return petDao.queryVarietiesByTypeId(typename);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Pet> queryByType(String typeId) {
        try {

            return petDao.queryByType(typeId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

    @Override
    public Page<Pet> queryPets(String typeid, int pageNumber) {
    Page<Pet> page = new Page<Pet>();
    //??????????????????
    page.setPageNo(pageNumber);
        int pageSize = page.getPageSize();

        int typeCount = petDao.queryCountByType(typeid);
        //????????????????????????
        if ("-1".equals(typeid)){

            //????????????
            int allCount = petDao.queryCountOfPets();
            page.setPageTotalCount(allCount);
            //?????????
            Integer pageTotal = allCount/pageSize;
            if(allCount%pageSize>0){
                pageTotal +=1 ;
            }
            page.setPageTotal(pageTotal);
            //???????????????
            int begin = (page.getPageNo()-1)*pageSize;
            List<Pet> pets = petDao.queryPets(begin, pageSize);
            page.setItems(pets);
            return page;
        }else{
            //????????????????????????
          int allCount =   petDao.queryCountByType(typeid);
            page.setPageTotalCount(allCount);
            //??????????????????
            Integer pageTotal = allCount/pageSize;
            if(allCount%pageSize>0){
                pageTotal +=1 ;
            }
            page.setPageTotal(pageTotal);
            //???????????????
            int begin = (page.getPageNo()-1)*pageSize;
            List<Pet> pets = petDao.queryByType(typeid,begin,pageSize);
            page.setItems(pets);
            return page;
        }

    }
}





