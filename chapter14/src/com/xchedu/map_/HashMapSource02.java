package com.xchedu.map_;

import java.util.HashMap;
import java.util.Objects;

public class HashMapSource02 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 1; i < 13; i++) {
//            hashMap.put(new A(i),"hello");
            hashMap.put(i,"hello");
        }
        for (int i = 13; i < Integer.MAX_VALUE; i++) {
            hashMap.put(i,"www");
        }

        System.out.println(hashMap);
    }
}

class A{
    private int i;

    public A(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return "\nA{" +
                "i=" + i +
                '}';
    }
}