package com.fanfan.hr.common;

public enum PoliticEnum {

    ZHONGGONGDY(1,"中共党员"),
    YUBEIDY(2,"中共预备党员"),
    GONGQINGTY(3,"共青团员"),
    MINGEDY(4,"民革党员"),
    QY(5,"其他");
    ;

    private final int key;
    private final String value;

    PoliticEnum(int key, String value) {
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
