package com.xchedu.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExtends {
    public static void main(String[] args) {
        /*
        泛型的繼承
        */
        Object o = new String("sss");
//        泛型不具繼承性
//        ArrayList<Object> objects = new ArrayList<String>();

        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AA> list3 = new ArrayList<>();
        List<BB> list4 = new ArrayList<>();
        List<CC> list5 = new ArrayList<>();

        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

//        printCollection2(list1); //x
//        printCollection2(list2); //x
        printCollection2(list3); //o
        printCollection2(list4); //o
        printCollection2(list5); //o

        printCollection3(list1); //o
//        printCollection3(list2); //x
        printCollection3(list3); //o
//        printCollection3(list4); //x
//        printCollection3(list5); //x
    }

    // List<?> 表示任意的泛型類型都可以接受
    public static void printCollection1(List<?> c){
        for (Object o : c) {
            System.out.println(o);
        }
    }

    // List<? extends AA> 表示上限，可以接受AA 或AA的子類
    public static void printCollection2(List<? extends AA> c){
        for (Object o : c) {
            System.out.println(o);
        }
    }

    // List<? super AA> 表示下限，可以接受AA 或AA的父類，不限於直接父類
    public static void printCollection3(List<? super AA> c){
        for (Object o : c) {
            System.out.println(o);
        }
    }

}
class AA{}
class BB extends AA{}
class CC extends BB{}