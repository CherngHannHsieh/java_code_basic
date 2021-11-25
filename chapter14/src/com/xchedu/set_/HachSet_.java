package com.xchedu.set_;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HachSet_ {
    public static void main(String[] args) {
        /*
        1. 建構子
        public HashSet() {
            map = new HashMap<>();
        }
        2. Hashset可以存放null，但只會有一個null，元素不重複
        3. 添加順序不一定和輸出順序一致
        */
        Set hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet);
    }
}
