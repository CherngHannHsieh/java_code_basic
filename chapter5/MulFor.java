import java.util.Scanner;

public class MulFor {
    public static void main(String[] args){
        /*
        化繁為簡
        1.) 計算1個班的成績
        1.1 創建scanner 接收輸入
        1.2 平均分數
        2.) 3個班
        3.) 所有班級的平均 totalScore 
        4.) int pass , score > 60
         */
        Scanner myScanner = new Scanner(System.in);
        double totalScore = 0;
        int pass = 0;
        int classNum = 3;
        int stuNum = 5;
        for(int i = 1;i <= classNum; i++){
            double sum = 0;
            for(int j = 1; j <= stuNum; j++){
                System.out.print("請輸入第" + i + "個班第" + j + "個學生的成績: ");
                double score = myScanner.nextDouble();
                if(score >= 60){
                    pass++;
                }
                sum += score;
                System.out.println(score);
            }
            System.out.println("sum = " + sum + " , 平均 = " + (sum / 5));
            totalScore += sum;
        }
        System.out.println("三個班總分 = " + totalScore + "， 平均 = " + (totalScore/15));
        System.out.println("及格人數 = " + pass);
    }
}


class MulFor2 {
    public static void main(String[] args){
        /*
        化繁為簡
        1. 1*1~1*9
        2. 2*2~9*9
        */
        for(int i = 1;i <= 9;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(j + "*" + i + "=" + (i * j));
                System.out.print("\t");
            }
            System.out.println("");
        }
    }

}

class MulFor3 {
    public static void main(String[] args){
        /* 空心金字塔
        化繁為簡
        1. 矩形 5*5
        2. 半個金字塔
        *
        **
        ***
        ****
        *****
        3. 整個金字塔      空格
       *      1    2*1-1  4
      ***     3    2*2-1  3 
     *****    5    2*3-1  2
    *******   7    2*4-1  1
   *********  9    2*5-1  0
        4. 空心金字塔
       *      1    當前行的第一個和最後一個是*
      * *     2    當前行的第一個和最後一個是*
     *   *    2    當前行的第一個和最後一個是*
    *     *   2    當前行的第一個和最後一個是*
   *********  9    維持
        先死後活
        1. 層數做成變數
        */

        int totalLevel = 25;

        for(int i = 1;i <= totalLevel;i++){
            //在輸出*之前要考慮空格
            for(int k = 1;k <= totalLevel - i;k++){
                System.out.print(" ");
            }
            //控制每層的*個數
            for(int j = 1;j <= 2 * i - 1;j++){
                //當前行的第一個和最後一個是*，最後一層都是*
                if(j == 1 || j == 2 * i -1 || i == totalLevel){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //換層
            System.out.println("");
        }
    }
}

class MulFor4 {
    public static void main(String[] args){
        /*
        空心菱形
        1. 半個金字塔
        2. 整個金字塔
        3. 倒的金字塔
        4. 整個菱形
        5. 空心菱形
        */
        //上面
        for(int i = 1;i <= 5;i++){

            for(int k = 1;k <= 5 - i;k++){
                System.out.print(" ");
            }

            for(int j = 1;j <= 2 * i - 1;j++){
                if(j == 1 || j == 2 * i - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }            
            }
            System.out.println("");
        }
        //下面
        for(int i = 4;i >= 1;i--){

            for(int k = 1;k <= 5 - i;k++){
                System.out.print(" ");
            }

            for(int j = 1;j <= 2 * i - 1;j++){
                if(j == 1 || j == 2 * i -1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}