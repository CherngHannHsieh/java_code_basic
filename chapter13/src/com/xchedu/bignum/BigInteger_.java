package com.xchedu.bignum;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
        //數太大
//        long l = 1231222222222222222222222222;
//        System.out.println("l = " + l);
        BigInteger bigInteger = new BigInteger("1231222222222222222222222222");
        System.out.println(bigInteger);
        System.out.println(bigInteger.getClass());

        //對 BigInteger 進行運算，要使用相應的方法
        BigInteger bigInteger1 = new BigInteger("100");
        System.out.println(bigInteger.add(bigInteger1));
        System.out.println(bigInteger.subtract(bigInteger1));
        System.out.println(bigInteger.divide(bigInteger1));
        System.out.println(bigInteger.multiply(bigInteger1));

    }
}
