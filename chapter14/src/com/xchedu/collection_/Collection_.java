package com.xchedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Collection_ {
    public static void main(String[] args) {
        // 集合主要分成兩組
        // 1. 單列集合
        // Collection 介面有兩個重要的子介面 List Set，他們的實現子類都是單列集合
        // 2. 雙列集合
        // Map 介面的實現子類，是雙列集合，存放Key-Value

        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");

        HashMap hashMap = new HashMap();
        hashMap.put("01","北京");
        hashMap.put("02","上海");
    }
}
