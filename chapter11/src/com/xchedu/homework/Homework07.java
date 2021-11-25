package com.xchedu.homework;

public class Homework07 {
    public static void main(String[] args) {
        Car car = new Car(41);
        car.getAir().flow();
        car.test();
        Car car2 = new Car(-10);
        car2.test();
        Car car3 = new Car(25);
        car3.test();
        Car car4 = new Car(39);
        car4.test();
    }
}

class Car{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if(temperature > 40){
                System.out.println("開冷氣");
            }else if(temperature < 0){
                System.out.println("開暖氣");
            }else{
                System.out.println("關掉空調");
            }
        }
    }

    public void test(){
        Air air = new Air();
        air.flow();
    }

    public Air getAir(){
        return new Air();
    }
}