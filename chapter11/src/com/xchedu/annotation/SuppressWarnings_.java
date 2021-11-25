package com.xchedu.annotation;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarnings_ {
    // 黨我們不希望看到這些警告的時候，可以使用@SuppressWarnings來抑制警告訊息
    //在{""}可以寫入你希望抑制的警告訊息
    // 作用範圍與放置位置有關
    // 放在main方法 ，抑制main方法的警告
    // 可以放在具體語句、方法、類
    // 看源碼
    // TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE
    // 可以設置數列  String[] value();
    @SuppressWarnings({"rawtypes","unchecked","unused"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("string");
        System.out.println(list.get(0));
    }
}
