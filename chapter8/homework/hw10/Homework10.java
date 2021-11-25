package com.homework.hw10;


public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("ff", 20, "ww", 'b', 200);
        Doctor doctor2 = new Doctor("ff", 20, "ww", 'b', 200);
        System.out.println(doctor.equals(doctor2));
    }
}

class Doctor{
    private String name;
    private int age;
    private String job;
    private char gender;
    private int sal;

    public Doctor(String name, int age, String job, char gender, int sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public boolean equals(Object obj){
        if(this == obj){ //類的== 比較是不是同對象
            return true;
        }
        if(!(obj instanceof Doctor)){
            return false;
        }
        //向下轉型
        Doctor d = (Doctor) obj;
        return this.name.equals(d.getName()) && this.age == d.getAge() && this.job.equals(d.getJob()) && this.gender == d.getGender() && this.sal == d.getSal();
    }
}
