package com.txx.entity.enums;

public enum RoleEnum {
    NORMAL("普通老师"),
    CLASSHEADER("班主任");

    private String value;
    RoleEnum(String value){
        this.value=value;
    }

    public String  getValue(int index){
        for(RoleEnum e : RoleEnum.values()){
            if(e.ordinal()==index){
                return e.value;
            }
        }
        return "";
    }
}
