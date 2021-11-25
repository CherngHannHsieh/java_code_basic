package com.xchedu.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        //1. set 不儲存重複的資料，可以添加null
        //2. 添加順序與取出順序不一致
        //3. 取出的順序是固定的(雖然與添加順序不一致)
        //4. 無法使用普通的for loop(無法通過索引取得)
        set.add("jacky");
        set.add("smith");
        set.add("Wang");
        set.add("jacky"); //重覆的
        set.add(null);
        set.add(null);
        System.out.println(set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        for (Object o : set) {
            System.out.println(o);
        }

    }
}
