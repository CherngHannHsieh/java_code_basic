package com.xchedu.single_;

public class SingleTon2 {
    public static void main(String[] args) {
        Cat ins = Cat.getCat();
        Cat ins2 = Cat.getCat();
        System.out.println(ins);
        System.out.println(ins2);
        System.out.println(ins == ins2);
    }
}

class Cat{
    private String name;
    private static Cat cat;
    //1. 建構子私有化
    //2. 定義一個靜態屬性
    ///3. 提供一個public static 方法
    private Cat(String name) {
        System.out.println("constructor...");
        this.name = name;
    }
    //只有當用戶使用時才創建對象
    public static Cat getCat(){
        if(cat == null){
            cat = new Cat("小花");
        }
        return  cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
