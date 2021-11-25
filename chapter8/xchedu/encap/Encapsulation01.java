package com.xchedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("jack 你好嗎");
        person1.setAge(30);
        person1.setSalary(100000);
        System.out.println(person1.info());
        Person smith = new Person("smith",50000,51);
        System.out.println(smith.info());
    }
}

class Person{
    public String name;
    private int age;
    private double salary;

    public Person() {
    }
    //提供建構子 ，若直接使用建構子可以繞開封裝
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //將set method 寫在 constructor 中
        setName(name);
        setAge(age);
        setSalary(5000000);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <=6){
            this.name = name;
        }else{
            System.out.println("名字長度錯誤");
            this.name = "無名";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1 && age <= 120){
            this.age = age;
        }else{
            System.out.println("年齡輸入錯誤，給予默認年齡18");
            this.age = 18;
        }
    }

    public double getSalary() {
        //增加認證機制
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info(){
        return name + "\t" + age + "\t" + salary;
    }
}
