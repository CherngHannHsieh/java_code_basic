public class TwoDimensionalArray {
    public static void main(String[] args) {
        // 二維陣列 => 一維陣列的元素(值)是一個一維陣列
        int[][] arr = {{0,0,0,0,0},{0,1,1,0,1},{1,2,3}};
        int count = 0;

        for(int i = 0; i < arr.length;i++){
            // 第i個元素(陣列)的長度
            for(int j = 0; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + "\t");
                count++;
            }
            System.out.println();
        }
        System.out.println(count);
    }
}

class TwoDimensionalArray2 {
    public static void main(String[] args) {
        /*
        1
        22
        333
        */
        //開一個二維 Array ，有 10 個element，但每個element 還沒有設定一維Array
        int[][] arr = new int[10][];

        for(int i = 0 ; i < arr.length ; i++){
            //給a[i] 開空間，沒有開則為 null
            arr[i] = new int[i + 1];

            for(int j = 0; j < arr[i].length ; j++){
                arr[i][j] = i + 1;
            }
        }

        for(int i = 0; i < arr.length;i++){
            // 第i個元素(陣列)的長度
            for(int j = 0; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + "\t");
                
            }
            System.out.println();
        }        
    }
}

class TwoDimensionalArray3 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] arr = {{4,6},{1,4,5,7},{-2}};
        for(int i = 0; i< arr.length;i++){
            for(int j = 0; j < arr[i].length;j++){
                System.out.print(arr[i][j] + "\t");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);

    }
}