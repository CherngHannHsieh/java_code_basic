package com.xchedu.polymorphic.PolyArr;

public class PolyArr {
    public static void main(String[] args) {
        //創建1個Person ，2個Student ，2 個Teacher
        //統一放在數組之中，並調用每個對象的say方法
        //父類的引用可以指向子類對象
        Person[] persons = new Person[5];
        persons[0] = new Person("jack",20);
        persons[1] = new Student("jacky",10,100.0);
        persons[2] = new Student("jacUU",20,150.0);
        persons[3] = new Teacher("jackdd",20,50000.0);
        persons[4] = new Teacher("jackafdad",20,10.0);

        //循環多態數組，調用say方法
        for(int i = 0 ; i < 5; i++){
            //編譯類型是Person，運行類型會根據情況改變
            System.out.println(persons[i].say()); //動態綁定機制

            //判斷 persons[i] 的運行類型是不是Student
            if(persons[i] instanceof Student) {
                //向下轉型
                Student s = (Student) persons[i];
                s.study();
                //((Student) persons[i]).study();
            }else if(persons[i] instanceof Teacher){
                //判斷 persons[i] 的運行類型是不是 Teacher
                //向下轉型
                Teacher t = (Teacher) persons[i];
                t.teach();
                //((Teacher) persons[i]).teach();
            }else if(persons[i] instanceof Person){

            }else{
                System.out.println("error");
            }
        }
    }
}
