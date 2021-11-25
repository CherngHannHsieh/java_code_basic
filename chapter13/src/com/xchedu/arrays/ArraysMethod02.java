package com.xchedu.arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1,3,7,9,15,16,84,91};

        //binarySearch
        // return -(low + 1);  // key not found.
        int index = Arrays.binarySearch(arr,-5);
        System.out.println(Arrays.toString(arr));
        System.out.println(index);

        //copyOf (數組,拷貝長度)
        //拷貝長度 < 0，返回異常
        //拷貝長度 > arr.length ， 在數組後面新增 null
        Integer[] newArr = Arrays.copyOf(arr,arr.length - 1);
        Integer[] newArr02 = Arrays.copyOf(arr,arr.length + 1);
        System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(newArr02));

        // fill 陣列元素填充
        //使用 987 去填充 num 陣列，替換該陣列的所有元素
        Integer[] num = {8,9,7};
        Arrays.fill(num,987);
        System.out.println(Arrays.toString(num));

        //equals 比較兩Array是否完全一樣
        Integer[] arr2 = {1,3,7,9,15,16,84,91};
        System.out.println(Arrays.equals(arr,arr2));

        //asList 將一組值 轉為list
        //將後方陣列轉成List集合
        // 編譯類型List (介面)
        // 運行類型 java.util.Arrays$ArrayList，是Arrays的靜態內部類
        List asList = Arrays.asList(2,3,6,9,7,4,8,1);
        System.out.println(asList);
        System.out.println(asList.getClass());
    }
}
