package com.xchedu.map_;

import java.util.Hashtable;

public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("john",100);
//        hashtable.put(null,100); NullPointerException
//        hashtable.put("john",null); NullPointerException
        hashtable.put("luck",100);
        hashtable.put("lic",100);
        hashtable.put("john1",80);
        hashtable.put("john2",80);
        hashtable.put("john3",80);
        hashtable.put("john4",80);
        hashtable.put("john5",80);
        hashtable.put("john6",80);
        hashtable.put("john7",80);
        System.out.println(hashtable);

        /*
        1. 底層有一個Array，Hashtable$Entry[] 初始大小為11
        2. thershold = 8 = 11 * 0.75
        3. 擴容方法 addEntry(hash, key, value, index); 添加K-V封裝到 Entry
        4. 當 if(count >= threshold) 滿足時，依照int newCapacity = (oldCapacity << 1) + 1; 進行擴容
        */
    }
}
