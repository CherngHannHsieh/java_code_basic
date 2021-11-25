package com.xchedu.homework;

public class Homework08 {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();
        //enum switch(列舉物件) case 列舉物件
        switch (Color.BLACK){
            case YELLOW:
                System.out.println("yellow");
                break;
            case BLACK:
                System.out.println("black");
                break;
            case GREEN:
                System.out.println("green");
                break;
        }
    }
}

interface Colors {
    void show();
}

enum Color implements Colors {
    RED(255, 0, 0), BLUE(0, 0, 255), BLACK(0, 0, 0), YELLOW(255, 255, 0), GREEN(0, 255, 0); //列舉物件

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public String toString() {
        return "Color{" +
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue +
                '}';
    }

    @Override
    public void show() {
        System.out.println(toString());
    }

}