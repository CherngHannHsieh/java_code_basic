package com.homework.hw13;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println("我會好好教學");
    }

    @Override
    public String play() {
        return super.play()+"象棋" ;
    }

    public void getInfo() {
        System.out.println("老師的訊息");
        System.out.println(super.info());
        System.out.println("工齡: " + work_age);
        teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}'  + super.toString();
    }
}
