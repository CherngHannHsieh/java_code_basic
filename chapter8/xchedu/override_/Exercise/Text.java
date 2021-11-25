package com.xchedu.override_.Exercise;

public class Text {
    public static void main(String[] args) {
        Person person = new Person("person",120);
        Student student = new Student("student",20,15151,450);
        System.out.println(person.say());
        System.out.println(student.say());
    }
}
