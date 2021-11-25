//聲明當前類所在的包，需要放在類的最上面，一個類最多只有一個package
package com.xchedu.pkg;

//放在package之後，類定義之前，可有多句且沒有順序要求
import java.util.Arrays;

// 需要使用哪個類 導入哪個類就好
public class Import01 {
    public static void main(String[] args) {
        //使用Arrays 完成排列
        int[] arr = {-1,5,6,9,7,3,4,2};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
