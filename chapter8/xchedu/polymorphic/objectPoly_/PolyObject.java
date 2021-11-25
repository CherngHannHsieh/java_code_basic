package com.xchedu.polymorphic.objectPoly_;

public class PolyObject {
    public static void main(String[] args) {
            //Animal 是編譯類型，Dog 是運行類型
            Animal animal = new Dog();
            //執行到該行時，animal 的運行類型是 Dog
            //所以cry 是 Dog 的 cry
            animal.cry();

            //Animal 是編譯類型，Cat 是運行類型
            animal = new Cat();
            animal.cry();
            /*  物件多型
            1. 一個物件的編譯類型與運行類型可以不一致
            ---> 也可以一致
            2. 編譯類型的編譯時就確定了，無法改變
            3. 運行類型可以改變
            4. 編譯類型在等號左側，運行類型在等號右側
            */
    }
}
