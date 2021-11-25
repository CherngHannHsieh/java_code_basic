package com.xchedu.codeblock;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie merry = new Movie("merry");
        Movie movie = new Movie("ddd", 5000, "tt");
    }
}

class Movie{
    private String name;
    private int price;
    private String director;
    //代碼塊
    //普通代碼塊是對建構子的補充機制
    //代碼塊的調用優先於建構子

    {
        System.out.println("1...");
        System.out.println("2...");
        System.out.println("3...");
    };

    public Movie(String name) {
        System.out.println("1 paramter");
        this.name = name;
    }

    public Movie(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, int price, String director) {
        System.out.println("constructor 3");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
