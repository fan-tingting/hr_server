package com.fanfan.hr.common.util;

import com.mysql.cj.util.StringUtils;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil {

    public static Date getDateFromStr(String str) {
        if(StringUtils.isNullOrEmpty(str)) {
            return null;
        }
        String replace = str.replace("T"," ").replace(".000Z","");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(replace, pos);
        return strtodate;
    }

}
