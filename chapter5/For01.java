public class For01 {
    public static void main(String[] args){
        //1.循環變數;2.循環條件;4.循環變數迭代
        for(int i = 0 ; i < 8 ; i++){
            //3.執行程式碼
            System.out.println("MDFK" + (i+1));
        }

        for(int i = 0,j = 0; i < 3;i++, j+= 2){
            System.out.println("i=" + i + " j=" + j);
        }
    }
}

class For02 {
    public static void main(String[] args){
        // 1~100之間所有9的倍數，統計個數和總和
        /* 分析
        化繁為簡
        1. 輸出1~100的值
        2. 在輸出的過程中，只輸出9的倍數
        3. 定義一個變數count，儲存個數總和
        4. 定義一個變數sum，儲存所有倍數的加總
        生死後活
        1. 將範圍的值做為變量
        2. 將倍數改為變量 t
        */
        int count = 0;
        int sum = 0;
        int start = 1;
        int end = 100;
        int t = 9;
        for(int i = start; i <= end; i++){
            if(i % t == 0){
                System.out.println("i = " + i);
                count++;
                sum += i;
            }
        }
        System.out.println("有" + count + "個9的倍數");
        System.out.println("sum = " + sum);
    }
}

class For03 {
    public static void main(String[] args){
        /*
        化繁為簡
        1. 輸出0~5
        2. 後面的 + 是 5-i
        生死後活
        1. 將 5 換為變數 n
        */
        int n = 50;
        for(int i = 0 ; i <= n ; i++){
            System.out.println(i + "+" + (n - i) + "=" + n);
        }
    }
}