package com.xchedu.homework;

public class Homework03 {
    public static void main(String[] args) {
//        Animal cat = new Cat();
//        Animal dog = new Dog();
//        cat.shout();
//        dog.shout();
        Animal cat = new Animal(){
            @Override
            void shout() {
                System.out.println("cat meowing");
            }
        };
        cat.shout();
        Animal dog = new Animal(){
            @Override
            void shout() {
                System.out.println("dog shouting");
            }
        };
        dog.shout();
    }
}

abstract class Animal{
    abstract void shout();
}

//class Cat extends Animal{
//    @Override
//    void shout() {
//        System.out.println("cat meowing");
//    }
//}
//
//class Dog extends Animal{
//    @Override
//    void shout() {
//        System.out.println("dog shouting");
//    }
//}