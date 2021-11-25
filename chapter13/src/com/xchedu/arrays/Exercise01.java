//package com.xchedu.arrays;
//
//import java.util.Comparator;
//
//public class Exercise01 {
//    public static void main(String[] args) {
//        Book[] books = new Book[4];
//        books[0] = new Book("first0001",250);
//        books[1] = new Book("first002",350);
//        books[2] = new Book("first3",200);
//        books[3] = new Book("first000004",150);
//        System.out.println("價格由大到小");
//        bubble(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                int i1 = (Integer) o1;
//                int i2 = (Integer) o2;
//                return i1 - i2;
//            }
//        });
//        for (Book b : books) {
//            System.out.println(b);
//        }
//
//        System.out.println("價格由小到大");
//        bubble(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                int i1 = (Integer) o1;
//                int i2 = (Integer) o2;
//                return i2 - i1;
//            }
//        });
//        for (Book b : books) {
//            System.out.println(b);
//        }
//
//        System.out.println("書名長度由大到小");
//        bubble2(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                int i1 = (Integer) o1;
//                int i2 = (Integer) o2;
//                return i1 -i2;
//            }
//        });
//        for(Book b:books){
//            System.out.println(b);
//        }
//    }
//
//    public static void bubble(Book[] books, Comparator c){
//        Book tempBook;
//        for (int i = 0; i < books.length - 1; i++) {
//            for(int j = 0 ; j < books.length - 1 - i;j++){
//                if(c.compare(books[j].getPrice(),books[j+1].getPrice()) < 0){
//                    tempBook = books[j];
//                    books[j] = books[j+1];
//                    books[j+1] = tempBook;
//                }
//            }
//        }
//    }
//
//    public static void bubble2(Book[] books, Comparator c){
//        Book tempBook;
//        for (int i = 0; i < books.length - 1; i++) {
//            for(int j = 0 ; j < books.length - 1 - i;j++){
//                if(c.compare(books[j].getName().length(),books[j+1].getName().length()) < 0){
//                    tempBook = books[j];
//                    books[j] = books[j+1];
//                    books[j+1] = tempBook;
//                }
//            }
//        }
//    }
//}
//
//class Book{
//    private String name;
//    private int price;
//
//    public Book(String name, int price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "name='" + name + '\'' +
//                ", price=" + price +
//                '}';
//    }
//}
//
