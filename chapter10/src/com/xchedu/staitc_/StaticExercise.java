package com.xchedu.staitc_;

public class StaticExercise {
}

//靜態方法，只能訪問靜態方法跟靜態屬性
//一般方法可以訪問所有成員
//仍需遵守訪問權限
class Person{
    private int id;
    private static int total = 0;

    public static int getTotalPerson(){
        //id++;   static only play with static
        //若想要將值賦予靜態屬性，使用類名.靜態屬性去讀取，不能使用this
        return total;
    }

    public Person() {
        total++;
        id = total;
    }

    public static void main(String[] args) {
        System.out.println(Person.getTotalPerson());
        Person person = new Person();
        System.out.println(Person.getTotalPerson());
    }
}
