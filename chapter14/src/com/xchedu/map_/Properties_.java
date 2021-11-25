package com.xchedu.map_;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {
        // Properties 繼承 Hashtable
        // K-V 不得為空
        Properties properties = new Properties();
        properties.put("john",100);
        properties.put("luck",100);
        properties.put("lick",100);
        properties.put("john",10);
        System.out.println(properties);

        System.out.println(properties.get("lick"));
        properties.remove("lick");
        System.out.println(properties);

    }
}
