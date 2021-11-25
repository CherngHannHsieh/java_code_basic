package com.xchedu.system_;

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {
        System.out.println("ok1");
        //exit(0) 表示程序退出 ，0是一個狀態，正常的狀態
//        System.exit(0);
        System.out.println("ok2");

        //arraycopy
        int[] arr = {1,3,2};
        int[] dest = new int[3]; //當前是{0,0,0}
        //源數組,從源數組的哪個index開始copy,目標數組,從目標數組的哪個index開始填入,從源數組copy多少個元素
        System.arraycopy(arr,0,dest,0,arr.length);
        System.out.println(Arrays.toString(dest));

        //返回 現在時間距離 1970/1/1的毫秒差
        System.out.println(System.currentTimeMillis());
    }
}
