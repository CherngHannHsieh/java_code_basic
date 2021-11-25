package com.xchedu.extend_;

public class PC extends Computer{
    private  String brand;

    //根據繼承規則 父類的建構子完成父類屬性的初始化
    //子類的建構子完成子類屬性的初始化
    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        setBrand(brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo(){
        System.out.println(getDetails() + " " + getBrand());
    }
}
