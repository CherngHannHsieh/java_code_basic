package com.xchedu.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSource_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("wang01",15);
        map.put("wang02",25);

        //1. k-v 最後是 HashMap$Node node = newNode(hash, key, value, null)
        //2. 為了方便遍歷，會在底層創立EntrySet ，該集合存放的元素的類型為 Entry ，一個Entry物件就會有k,v，EntrySet<Entry<k,v>> ， 即 : transient Set<Map.Entry<K,V>> entrySet;
        //3. 在 EntrySet 中，定義的類型是Map.Entry，實際上存放的是 HashMap$Node
        //這是因為 static class Node<K,V> implements Map.Entry<K,V>
        //4. 當把 HashMap$Node 物件儲存到 entrySet 就方便我們遍歷，因為 Map.Entry提供了兩個重要的方法
        //K getKey(); V getValue();
        Set entrySet = map.entrySet();
        System.out.println(entrySet.getClass());//HashMap$EntrySet
        for (Object o : entrySet) {
//            System.out.println(o.getClass()); //HashMap$Node
            //為了從Node中取出k-v
            //先向下轉型
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
