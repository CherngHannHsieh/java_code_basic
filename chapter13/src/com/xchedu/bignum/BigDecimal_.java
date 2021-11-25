package com.xchedu.bignum;

import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {
        BigDecimal bigDecimal =
                new BigDecimal("11.1111111122222222222222233333333333333333333333333333333333333333333333333333");
        System.out.println(bigDecimal);

        //操作方法同BigInteger
        BigDecimal bigDecimal1 = new BigDecimal("7.0");
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(bigDecimal.multiply(bigDecimal1));
        //除法有可能拋出異常(循環小數)
        //調用方法時，指定精度即可
        System.out.println(bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING));
    }
}
