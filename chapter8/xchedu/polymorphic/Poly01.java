package com.xchedu.polymorphic;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("Tom");
        Dog white = new Dog("White~");
        Bone www = new Bone("www~");
        tom.feed(white,www);
        System.out.println();
        Cat cat = new Cat("cat~");
        Fish fish = new Fish("fish~");
        tom.feed(cat,fish);
    }
}
