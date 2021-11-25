package com.xchedu.list_;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListExercise02 {
    public static void main(String[] args) {
        List list = new Vector();
//        List list = new ArrayList();
//        List list = new ArrayList();
        list.add(new Book("author1", 500, "dads"));
        list.add(new Book("author2", 50, "fads"));
        list.add(new Book("author3", 100, "fs"));

        //如何對集合排序

        for (Object o :list) {
            System.out.println(o);
        }

        bubble(list);
        for (Object o :list) {
            System.out.println(o);
        }

    }

    public static void bubble(List list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                // 由於List中儲存為 Object -> 向下轉型
                Book b1 = (Book) list.get(j);
                Book b2 = (Book) list.get(j+1);
                if(b1.getPrice() > b2.getPrice()){
                    //利用List提供的set方法來交換
                    list.set(j,b2);
                    list.set(j+1,b1);
                }
            }
        }
    }
}

class Book {
    private String name;
    private int price;
    private String author;

    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "name='" + name + ", price=" + price + ", author='" + author;
    }
}