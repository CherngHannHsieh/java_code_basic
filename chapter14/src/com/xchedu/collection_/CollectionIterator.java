package com.xchedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三國演義","羅貫中",1000));
        col.add(new Book("小李飛刀","李龍",1500));
        col.add(new Book("紅樓夢改","小王",100));

//        System.out.println(col);
//        想遍歷 col 集合
//        1. 先得到 col 對應的 Iterator
        Iterator iterator = col.iterator();
//        2. 使用while循環遍歷
//        while(iterator.hasNext()){ //判斷是否還有數據
//            ///返回下一個元素 類型是Object
//            Object obj = iterator.next();
//            System.out.println("obj = " + obj);
//        }
        //快捷鍵，快速升成 while => itit
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("obj = " + next);
        }
        //顯示所有快捷鍵 ctrl + j

        //3. 當退出while後，此時iterator指向最後的元素
//        iterator.next(); NoSuchElementException

        //4. 如果希望再次遍歷，需要重製iterator
        iterator = col.iterator();
        System.out.println("第二次");
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        iterator = col.iterator();
        System.out.println("third");
        //foreach，底層仍是iterator
        //foreach 是簡化版本的迭代器遍歷 (快捷鍵 : I)
        for (Object book:col) {
            System.out.println(book);
        }
    }
}

class Book{
    private String name;
    private String author;
    private int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}