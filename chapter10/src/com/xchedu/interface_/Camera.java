package com.xchedu.interface_;

public class Camera implements UsbInterface{ //實現interface，將interface的方法實現
    @Override
    public void start() {
        System.out.println("Camera start");
    }

    @Override
    public void stop() {
        System.out.println("Camera stop");
    }
}
