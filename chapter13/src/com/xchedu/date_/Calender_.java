package com.xchedu.date_;

import java.util.Calendar;

public class Calender_ {
    public static void main(String[] args) {
        // Calender是抽象類，建構子是 protected
        // 通過 getInstance() 獲取實例
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.get(Calendar.YEAR));
        //MONTH 從 0開始
        System.out.println(c.get(Calendar.MONTH) + 1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));

        //沒有提供格式化方法，需要自行組合
        //24小時制 HOUR ->HOUR_OF_DAY
    }
}
