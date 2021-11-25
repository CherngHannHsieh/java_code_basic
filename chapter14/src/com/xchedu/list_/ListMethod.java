package com.xchedu.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("小王");
        list.add("小白");
        //在特定索引值插入值
        list.add(1,"小黑");
        System.out.println(list);
        //addAll(int index , Collection c):從index位置將c中的所有元素添加進來
        System.out.println(list.indexOf("小白"));
        list.remove("小黑");
        //set()  相當於替換
        list.set(1,"王八蛋");
        System.out.println(list);
        // 截取
        System.out.println(list.subList(0,2));
    }
}
