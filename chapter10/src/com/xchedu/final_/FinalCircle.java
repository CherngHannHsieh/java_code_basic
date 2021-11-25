package com.xchedu.final_;

public class FinalCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.getArea();
    }
}

class Circle{
    private double radius;
    private final double PI = 3.14;

    {
        //PI = 3.14;
    }
    public Circle(double radius) {
        //PI = 3.14;
        this.radius = radius;
    }

    public void getArea(){
        System.out.println(radius * radius * PI);
    }
}
