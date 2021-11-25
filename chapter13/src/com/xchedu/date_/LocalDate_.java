package com.xchedu.date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {
    public static void main(String[] args) {
        // now() 返回當前日期時間
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
//        System.out.println("year = " + ldt.getYear());
//        System.out.println("month = " + ldt.getMonth());
//        System.out.println("month = " + ldt.getMonthValue());
//        System.out.println("day = " + ldt.getDayOfMonth());
//        System.out.println("day = " + ldt.getDayOfWeek());
//        System.out.println("hour = " + ldt.getHour());
//        System.out.println("minute = " + ldt.getMinute());
//        System.out.println("second = " + ldt.getSecond());

        //DateTimeFormatter
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd E HH:mm:ss");
        String format = dtf.format(ldt);
        System.out.println(format);

        //plus 890days後是什麼時候
        LocalDateTime localDateTime = ldt.plusDays(890);
        System.out.println(dtf.format(localDateTime));

        //minus 3456 minutes 前
        System.out.println(dtf.format(ldt.minusMinutes(3456)));

    }
}