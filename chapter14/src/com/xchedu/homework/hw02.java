package com.xchedu.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class hw02 {
    public static void main(String[] args) {
        Car car = new Car("bmw", 4000000);
        Car car2 = new Car("bensi", 50000000);
        ArrayList arrayList = new ArrayList();
        arrayList.add(car);
        arrayList.add(car2);
        System.out.println(arrayList);
        arrayList.remove(car);
        System.out.println(arrayList);
        System.out.println(arrayList.contains(car));
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        arrayList.clear();
        System.out.println(arrayList);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(car);
        arrayList1.add(car2);
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);
        System.out.println(arrayList.containsAll(arrayList1));
//        arrayList.removeAll(arrayList1);
        for (Object o : arrayList) {
            System.out.println(o);
        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

    }
}

class Car{
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}