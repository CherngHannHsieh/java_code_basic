package com.xchedu.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Exercise01ver2 {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("first0001",250);
        books[1] = new Book("first002",350);
        books[2] = new Book("first3",200);
        books[3] = new Book("first000004",150);

        //1. price 大到小
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                if(b1.getPrice() - b2.getPrice() < 0){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        System.out.println(Arrays.toString(books));

        //2.price 小到大
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                if(b1.getPrice() - b2.getPrice() < 0){
                    return -1;
                }else{
                    return 1;
                }
            }
        });
        System.out.println(Arrays.toString(books));

        //3.
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                if(b1.getName().length() - b2.getName().length() < 0){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        System.out.println(Arrays.toString(books));
    }
}

class Book{
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}