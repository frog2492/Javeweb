package com.yxy.pojo;

public class PetType {
    private String typeId;
    private String typeName;

    public PetType(String typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public PetType() {
    }

    @Override
    public String toString() {
        return "PetType{" +
                "typeId='" + typeId + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}

