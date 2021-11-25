package com.xchedu.map_;

import java.util.HashMap;
import java.util.Map;

public class Map_ {
    public static void main(String[] args) {
        //1. map 保存 k-v
        //2. map 的 key不能重複
        //3. map 的 value 可以重複
        //4. key 可以為 null，但只能有一個；value可以為null，可以有多個
        //5. 常用 String類  作為 key (Object key,Object value)
        //6. key - value 之間存在單向一對一，指定的 key 總能找到對應的 value
        Map map = new HashMap();
        map.put("wang01",15);
        map.put("wang02",25);
        map.put("wang03",5);
        map.put("wang04",51);
        map.put("wang01",600); //相同key 等同於替換
        System.out.println(map);
    }
}
