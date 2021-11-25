import java.util.Scanner;

public class Array01{
    public static void main(String[] args){
        double totoalWeight = 0;
        double[] hens = { 3, 5, 1, 3.4, 2, 50};
        for(int i = 0;i < hens.length; i++){
            // System.out.println(hens[i]);
            totoalWeight += hens[i];
        }
        System.out.println(totoalWeight + "\t" + totoalWeight / 6);
    }
}

class Array02{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        // double[] score = new double[5];
        double[] score; //宣告變數
        score = new double[5]; //分配內存空間
        for(int i = 0; i < score.length; i++){
            System.out.print("輸入第" + (i+1) + "分數: ");
            score[i] = myScanner.nextDouble();
        }

        for(int i = 0; i < score.length; i++){
            System.out.println(score[i]);
        }
    }
}

