package com.xchedu.String_;

public class Exercise10 {
}

class Test {
    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'v', 'a'}; //數組講義看內存

    public void change(String str, char ch[]) {
//        this.str = "java";
        str = "java"; //就近原則(this講義)，此處是將傳入的 str 改為 java，若要更動本身物件的str，應該用this.str
        ch[0] = 'h'; //final array -->代表該 array 所指向的地址不能更動，但其值是可以變動的
    }

    public static void main(String[] args) {
        Test ex = new Test();
        ex.change(ex.str, ex.ch);
        //呼叫方法會開新棧-->遞迴講義
        System.out.println(ex.str);
        System.out.println(ex.ch);
        String a = "aaa";
        String b = "bbb";
        String c = a + b;
    }
}