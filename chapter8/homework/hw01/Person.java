package com.homework.hw01;

public class Person {
    private String name;
    private int age;
    private String job;

    public Person() {
    }

    public Person(String name, int age, String job) {
        setName(name);
        setAge(age);
        setJob(job);
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

//    public void bubbleSort(Person[] pArr){
//
//        String maxName = pArr[0].getName();
//        int maxAge = pArr[0].getAge();
//        String maxJob = pArr[0].getJob();
//
//        int maxIndex = 0;
//
//        String tempName  = "";
//        int tempAge  = 0;
//        String tempJob  = "";
//
//        for (int i = 0; i <= pArr.length - 1; i++) {
//            for(int j = 0 ; j < pArr.length - 1 - i ;j++){
//                if(maxAge < pArr[i].getAge()){
//                    tempName = maxName;
//                    tempAge = maxAge;
//                    tempJob = maxJob;
//
//                    pArr[maxIndex].setName(pArr[i].getName());
//                    pArr[maxIndex].setAge(pArr[i].getAge());
//                    pArr[maxIndex].setJob(pArr[i].getJob());
//
//                    pArr[i].setName(tempName);
//                    pArr[i].setAge(tempAge);
//                    pArr[i].setJob(tempJob);
//
//                    maxIndex++;
//                }
//            }
//            maxIndex = 0;
//        }
//        for (int i = 0; i < pArr.length; i++) {
//            System.out.print(pArr[i].getName() + "\t");
//            System.out.print(pArr[i].getAge() + "\t");
//            System.out.print(pArr[i].getJob() + "\t");
//        }
//    }
}
