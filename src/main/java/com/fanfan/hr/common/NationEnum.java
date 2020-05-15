package com.fanfan.hr.common;

public enum NationEnum {

    HAN(1,"汉族"),
    MENGGU(2,"蒙古族"),
    HUI(3,"回族"),
    ZANG(4,"藏族");

    private final int key;
    private final String value;

    NationEnum(int key, String value){
        this.key = key;
        this.value = value;
    }
    public static String getValue(int key){
        for(int i = 0; i < values().length; i++){
            if(values()[i].key == key){
                return values()[i].value;
            }
        }
       return null;
    }
    public static int getKey(String value){
        for(int i = 0; i < values().length; i++){
            if(values()[i].value.equals(value)){
                return values()[i].key;
            }
        }
        return 0;
    }

}
