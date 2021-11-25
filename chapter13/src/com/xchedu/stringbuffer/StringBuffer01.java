package com.xchedu.stringbuffer;

public class StringBuffer01 {
    public static void main(String[] args) {
        //String -->StringBuffer
        String str = "hello tom";
        //返回的裁示StringBuffer ，str沒有影響
        //1.
        StringBuffer sb = new StringBuffer(str);
        //2.
        StringBuffer sb1 = new StringBuffer();
        sb1 = sb1.append(str);

        // StringBuffer --> String
        //1.
        StringBuffer stringBuffer = new StringBuffer("wwwwww");
        String s = stringBuffer.toString();
        //2.
        String s1 = new String(stringBuffer);
    }
}
