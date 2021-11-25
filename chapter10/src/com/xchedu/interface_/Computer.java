package com.xchedu.interface_;

public class Computer {
    //1. 形參是介面類型 UsbInterface
    //2. 可接收 實作該介面的類 的物件實例
    public void work(UsbInterface usbInterface){
        //透過interface來調用方法
        usbInterface.start();
        usbInterface.stop();
    }
}
