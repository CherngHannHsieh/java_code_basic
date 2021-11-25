package com.xchedu.date_;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class Date01 {
    public static void main(String[] args) throws Exception {
        // 獲取當前系統時間
        // Date 在 java.util
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        System.out.println(simpleDateFormat.format(date));

        // 將格式化 String 轉成 Date
        // String to Date時 simpleDateFormat格式要與String相同
        String s = "2021年07月06日 12:16:28 週二";
        Date parse = simpleDateFormat.parse(s);
        System.out.println(simpleDateFormat.format(parse));
    }
}
