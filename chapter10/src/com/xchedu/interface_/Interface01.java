package com.xchedu.interface_;

//相關檔案 UsbInterface Phone Camera Computer
public class Interface01 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Camera camera = new Camera();
        Computer computer = new Computer();
        //phone camera 皆實作了介面 UsbInterface
        computer.work(phone);
        computer.work(camera);
    }
}

