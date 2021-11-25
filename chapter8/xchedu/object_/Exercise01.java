package com.xchedu.object_;

public class Exercise01 {
    public static void main(String[] args) {
        Person person = new Person("my",20,'b');
        Person person2 = new Person("myl",20,'b');
        // Person 的 equals 繼承 Object 的方法 -> 比較兩個是否為同地址(對象)
        // 改寫equals
        System.out.println(person.equals(person2));
    }
}

class Person{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public boolean equals(Object obj){
        //比較兩個是否為同對象
        if(this == obj){
            return true;
        }
        //判斷是否為Person
        if(obj instanceof Person){
            //向下轉型 ，需要取得 obj 的各個屬性
            Person p2 = (Person) obj;
            //
            return this.getName().equals(p2.getName()) && this.getAge() == p2.getAge() && this.getGender() == p2.getGender();
        }
        //不是Person 直接返回false
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
