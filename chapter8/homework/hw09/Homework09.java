package com.homework.hw09;

public class Homework09 {
}

class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class LabeledPoint extends Point{
    private String labeled;

    public LabeledPoint(String labeled, double x, double y) {
        super(x, y);
        this.labeled = labeled;
    }
}

