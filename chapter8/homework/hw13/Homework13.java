package com.homework.hw13;

public class Homework13 {
    public static void main(String[] args) {
//        Teacher teacher = new Teacher("teach", "女", 23, 5);
//        teacher.getInfo();
//        System.out.println("------------------------------------------");
//        Student student = new Student("ming", "男", 15, "00123546");
//        student.getInfo();

        //多態數組
        Person[] persons = new Person[4];
        persons[0] = new Student("ming", "男", 18, "00123546");
        persons[1] = new Student("ninig", "女", 15, "001255446");
        persons[2] = new Teacher("teach", "女", 35, 5);
        persons[3] = new Teacher("BEAR", "男", 25, 15);

        Homework13 homework13 = new Homework13();
        homework13.bubbleSort(persons);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

        for (int i = 0; i < persons.length; i++) {
//            System.out.println();
            homework13.test(persons[i]);
        }
    }

    public void bubbleSort(Person[] persons){
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for(int j = 0 ; j < persons.length - 1 - i;j++){
                if(persons[j].getAge() < persons[j+1].getAge()){
                    temp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = temp;
                }
            }
        }
    }

    public void test(Person p){
        if(p instanceof Student){
            ((Student) p).study();
        }else if(p instanceof Teacher){
            ((Teacher) p).teach();
        }
    }
}
