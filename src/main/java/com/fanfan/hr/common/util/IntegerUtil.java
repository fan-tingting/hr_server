package com.fanfan.hr.common.util;

public class IntegerUtil {
    public static boolean judgeInteger( Integer number){
        if(number == null || number < 1){
            return false;
        }
        return true;
    }
}
