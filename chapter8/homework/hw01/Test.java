package com.homework.hw01;

public class Test {
    public static void main(String[] args) {

        //創建Person類數組
        Person[] peoples = new Person[3];
        peoples[0] = new Person("small", 1, "sw");
        peoples[1] = new Person("large", 3, "lw");
        peoples[2] = new Person("middle", 2, "mw");

        for (int i = 0; i < peoples.length; i++) {
            System.out.println(peoples[i]); //默認對象的toString()
        }
        System.out.println("=========================================");

        //bubble sort  對象的冒泡操作 創建一個 類名 temp = null 即可
        //Person temp 臨時變數用於交換
        Person temp = null;
        for (int i = 0; i < peoples.length - 1; i++) {
            for (int j = 0; j < peoples.length - 1 - i; j++) {
                //小的往後丟
                if (peoples[j].getAge() < peoples[j + 1].getAge()) {
                    temp = peoples[j];
                    peoples[j] = peoples[j+1];
                    peoples[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < peoples.length; i++) {
            System.out.println(peoples[i]);
        }
    }
}
