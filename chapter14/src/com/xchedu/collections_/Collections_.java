package com.xchedu.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collections_ {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("tom");
        arrayList.add("smith");
        arrayList.add("king");
        arrayList.add("milan");
        arrayList.add("tom");
        System.out.println(arrayList);
        //翻轉
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        //隨機排列
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        //自然排序
        Collections.sort(arrayList);
        System.out.println(arrayList);
        //依照字符串長度大小排序
        Collections.sort(arrayList, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println(arrayList);
        //指定List中的兩個元素進行交換
        Collections.swap(arrayList,0,1);
        System.out.println(arrayList);
        //依自然排序，返回集合中最大元素
        System.out.println(Collections.max(arrayList));
        //返回字符串長度最大的元素
        System.out.println(Collections.max(arrayList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        }));
        //返回集合中特定元素的出現次數
        System.out.println(Collections.frequency(arrayList,"tom"));

        //將src拷貝到dest中
        ArrayList arrayList1 = new ArrayList();
        //為了成功複製，需要先給dest賦值，長度與arrayList.size()一樣
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList1.add("");
        }
        Collections.copy(arrayList1,arrayList);
        System.out.println(arrayList1);

        //替換
        Collections.replaceAll(arrayList,"tom","tomm");
        System.out.println(arrayList);
    }
}
