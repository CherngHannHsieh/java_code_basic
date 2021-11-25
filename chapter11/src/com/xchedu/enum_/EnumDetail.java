package com.xchedu.enum_;

public class EnumDetail {
    public static void main(String[] args) {
        Music.CLASSICALMUSIC.play();
    }
}

class A {
}

// No extends clause allowed for enum
//enum Season3 extends A{}
interface B {
    public void play();
}

enum Music implements B {
    //等同 public static final Music CLASSICALMUSIC = new Music();
    CLASSICALMUSIC;   //列舉物件

    @Override
    public void play() {
        System.out.println("enum implements");
    }
}