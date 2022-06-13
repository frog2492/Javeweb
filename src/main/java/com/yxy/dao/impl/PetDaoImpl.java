package com.yxy.dao.impl;

import com.yxy.dao.PetDao;
import com.yxy.pojo.Pet;
import com.yxy.pojo.PetType;

import java.util.List;

public class PetDaoImpl extends BaseDao implements PetDao {
    @Override
    public Pet queryById(String id) {
        String sql = "select pet_id petId,pet_sex sex ,type_id type,`describe`,weight,birthday,picture,picture1,picture2,reference_price price,pin_number pin,store_id storeId from pet where pet_id=?";
        return queryForOne(Pet.class, sql, id);
    }

    @Override
    public List<Pet> queryAll() {
        String sql="select pet_id petId,pet_sex sex ,type_id type,`describe`,weight,birthday,picture,picture1,picture2,reference_price price,pin_number pin,store_id storeId ,num from pet";
        return queryForList(Pet.class, sql);
    }

    @Override
    public String queryVarietiesByTypeId(String typeId) {
        String sql="select type_name from pet_type where type_id=?";
        return (String)queryForValues(sql,typeId);
    }

    @Override
    public String queryVarietiesByTypeName(String typename) {
        String sql="select type_id from pet_type where type_name=?";
        return (String)queryForValues(sql,typename);
    }

    @Override
    public List<PetType> queryAllPetTypeName() {
        String sql="select type_id typeId,type_name typeName from pet_type";
        return queryForList(PetType.class,sql);
    }

    @Override
    public void deletePet(String pid) {
        String sql ="delete from pet where pet_id=?";
        update(sql,pid);
    }

    @Override
    public void updatePetInfo(Pet pet) {
        String sql="update pet set type_id=?,`describe`=?,weight=?,birthday=?,picture=?,picture1=?,picture2=?,reference_price=? ,pin_number=?,num=? where pet_id=?";
        update(sql,pet.getType(),pet.getDescribe(),pet.getWeight(),pet.getBirthday(),pet.getPicture(),pet.getPicture1(),pet.getPicture2(),pet.getPrice(),pet.getPin(),pet.getNum(),pet.getPetId());
    }

    @Override
    public void addPet(Pet pet) {
        String sql="insert into pet values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        update(sql,pet.getPetId(),pet.getSex(),pet.getType(),pet.getPicture(),pet.getPicture1(),pet.getDescribe(),pet.getWeight(),pet.getBirthday(),pet.getPrice(),pet.getPin(),pet.getStoreId(),pet.getPicture2(),pet.getNum());
    }

    @Override
    public List<Pet> queryByType(String typeId) {
        String sql = "select pet_id petId,pet_sex sex ,type_id type,`describe`,weight,birthday,picture,picture1,picture2,reference_price price,pin_number pin,store_id storeId from pet where type_id=?";
        return queryForList(Pet.class, sql, typeId);
    }

    @Override
    public List<Pet> queryPets(int pageIndex, int pageSize) {
        String sql="select pet_id petId,pet_sex sex ,type_id type,`describe`,weight,birthday,picture,picture1,picture2,reference_price price,pin_number pin,store_id storeId ,num from pet limit ?,?";
        return queryForList(Pet.class,sql,pageIndex,pageSize);

    }

    @Override
    public List<Pet> queryByType(String typeId, int pageIndex, int pageSize) {
        String sql = "select pet_id petId,pet_sex sex ,type_id type,`describe`,weight,birthday,picture,picture1,picture2,reference_price price,pin_number pin,store_id storeId ,num from pet where type_id=?  limit ?,?";
        return queryForList(Pet.class, sql, typeId,pageIndex,pageSize);
    }

    @Override
    public int queryCountOfPets() {
        String sql ="select count(*) from pet";
        Number count = (Number) queryForValues(sql);
        return count.intValue();
    }

    @Override
    public int queryCountByType(String typeId) {
        String sql ="select count(*) from pet where type_id=?";
        Number count = (Number) queryForValues(sql,typeId);
        return count.intValue();
    }
}

