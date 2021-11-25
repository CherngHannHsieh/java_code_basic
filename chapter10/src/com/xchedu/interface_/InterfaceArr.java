package com.xchedu.interface_;

public class InterfaceArr {
    public static void main(String[] args) {
        //多型數列->介面類型數列
        Usb[] usbs = new Usb[2];
        usbs[0] = new iPhone();
        usbs[1] = new iCamera();

        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work(); //動態綁定
            //類型判斷，向下轉型
            if(usbs[i] instanceof iPhone){
                ((iPhone) usbs[i]).call();
            }
        }
    }
}

interface Usb {
    void work();
}

class iPhone implements Usb {
    @Override
    public void work() {
        System.out.println("手機...");
    }

    public void call() {
        System.out.println("手機打電話...");
    }
}

class iCamera implements Usb {
    @Override
    public void work() {
        System.out.println("相機...");

    }
}