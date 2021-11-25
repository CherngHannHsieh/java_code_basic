package com.xchedu.wrapper;

public class WrapperType {
    public static void main(String[] args) {
        // int <----> Integer
        // jdk5前世手動裝箱、拆箱
        // 手動裝箱
        int n1 =100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
        //手動拆箱
        int i = integer.intValue();

        //自動裝箱
        int n2 = 10;
        Integer integer2 = n2; //底層運作Integer.valueOf(n2)

        //自動拆箱
        int n3 = integer2; //底層運作integer2.intValue()
    }
}
