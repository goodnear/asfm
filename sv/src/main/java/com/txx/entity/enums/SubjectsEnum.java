package com.txx.entity.enums;

public enum SubjectsEnum {
    Chinese("语文"),
    MATH("数学"),
    ENGLISH("英语"),
    POLITICS("政治"),
    HISTORY("历史"),
    GEOGRAPBY("地理"),
    PHYSICS("物理"),
    CHEMISTRY("化学"),
    BIOLOGY("生物");

    private String value;
    SubjectsEnum(String value){
        this.value=value;
    }

    public String  getValue(int index){
        for(SubjectsEnum e : SubjectsEnum.values()){
            if(e.ordinal()==index){
                return e.value;
            }
        }
        return "";
    }
}
