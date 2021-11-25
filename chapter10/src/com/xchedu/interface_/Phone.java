package com.xchedu.interface_;

//實現 UsbInterface
public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("Phone start");
    }

    @Override
    public void stop() {
        System.out.println("Phone stop");
    }
}
