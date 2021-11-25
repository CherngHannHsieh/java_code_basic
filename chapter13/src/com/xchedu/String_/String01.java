package com.xchedu.String_;

public class String01 {
    public static void main(String[] args) {
        //字符串常數,雙引號引起來的
        //Unicode
        //String 有很多建構子
        //常用的 String(),String(String),String(char[]),String(char[],int,int),String(byte[])
        //String 實作了Serializable 介面，可以序列化，在網路傳輸；Compare介面，可以比較
        //String 是 final 類，不能被其他類繼承
        //String 有屬性 private final byte[] value，用於儲存字符串內容
        //value 是 final 類 ，不能修改(地址不能修改)，value不能只向新的地址
        String name = "jacky";
        name = "tom";
        final byte[] value = {'a','b','c'};
        byte[] v2 = {'t','o','m'};
        value[0] = 'h';
        // value = v2; Cannot assign a value to final variable 'value'

        // intern，返回字符串常量池的位址
    }
}
