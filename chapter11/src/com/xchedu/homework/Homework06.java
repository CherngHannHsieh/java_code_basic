package com.xchedu.homework;

public class Homework06 {
    public static void main(String[] args) {
        Person tong = new Person("tong", new Horse());
        tong.common();
        tong.passRiver();
        tong.passMount();
    }
}

interface Vehicles {
    void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("Horse ... ");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("Boat ... ");
    }
}

class Airplane implements Vehicles{
    @Override
    public void work() {
        System.out.println("Airplane ... ");
    }
}

class VehicleFactor {
    //馬始終是一匹 -->餓漢式
    private static Horse horse = new Horse();

    private VehicleFactor() {
    }

    public static Horse getHorse() {
//        return new Horse();
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Airplane getPlane(){
        return new Airplane();
    }
}

class Person {
    private String name;
    private Vehicles vehicles;

    //創建時有給交通工具
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
//        Boat boat = VehicleFactor.getBoat();
//        boat.work();
        //判斷當前的vehicles是否是船
        //vehicles = null => vehicles instanceof Boat,false
        if (!(vehicles instanceof Boat)) {
            vehicles = VehicleFactor.getBoat();
        }
        vehicles.work();
    }

    public void common() {
//        Horse horse = VehicleFactor.getHorse();
//        horse.work();
        if (!(vehicles instanceof Horse)) {
            vehicles = VehicleFactor.getHorse();
        }
        vehicles.work();
    }

    public void passMount(){
        if(!(vehicles instanceof Airplane)){
            vehicles = VehicleFactor.getPlane();
        }
        vehicles.work();
    }
}