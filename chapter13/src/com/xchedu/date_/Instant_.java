package com.xchedu.date_;

import java.util.Date;
import java.time.Instant;

public class Instant_ {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        Date date = Date.from(now);
        System.out.println(date);

        Instant ins = date.toInstant();
        System.out.println(ins);
    }
}
