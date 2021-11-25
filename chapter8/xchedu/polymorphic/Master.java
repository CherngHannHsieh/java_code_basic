package com.xchedu.polymorphic;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //使用物件多態來編寫
    // animal 的編譯類型為 Animal ，可以指向 Animal 子類別的物件
    //food 的編譯類型為 Food ，可以指向 Food 子類別的物件
    //因為可以使用父類別的引用 指向 子類別的對象
    //換句話說 此方法可以接收任何動物類的子對象 和 食物類的子對象
    public void feed(Animal animal,Food food){
        System.out.println(name + " " + animal.getName() + " 吃 " + food.getName());
    }

    //feed dog bone
//    public void feed(Dog dog , Bone bone){
//        System.out.println(name + " " + dog.getName() + " 吃 " + bone.getName());
//    }
//
//    //feed cat fish
//    public void feed(Cat cat , Fish fish){
//        System.out.println(name + " " + cat.getName() + " 吃 " + fish.getName());
//    }

    // 動物種類 食物種類增多 不利管理和維護
    // ----> 多態(polymorphic)
}
