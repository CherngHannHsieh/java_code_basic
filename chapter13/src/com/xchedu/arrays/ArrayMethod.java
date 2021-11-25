package com.xchedu.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayMethod {
    public static void main(String[] args) {
        Integer[] i = {1,2,5,8,9,3,4,6,7};
        Integer[] j = {1,2,5,8,9,3,4,6,7};
//        for(Integer inte : i){
//            System.out.println(inte);
//        }

        //Arrays.toString()顯示數組
        System.out.println(Arrays.toString(i));

        //sort
        //數組是引用類型，排序後會影響到實參
        //sort 重載的，可透過介面Comparator來訂製排序

        System.out.println(Arrays.toString(j));
        //Arrays.sort(j); //默認方法
        Arrays.sort(j, new Comparator() {
            //要求實現compare方法
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(j));

    }
}
