public class YangHui {
    public static void main(String[] args) {
        /*
        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1
        1 5 10 10 5 1

        1. 第n行有n個元素
	    2. 每一行的第一個和最後一個元素都是1

        要求:10行楊輝三角
        */

        int[][] arr = new int[15][];
        for(int i = 0; i < arr.length ; i++){
            //給每個元素空間
            arr[i] = new int[i+1];
            //賦值，for loop
            for(int j = 0; j < arr[i].length ; j++){
                if(j == 0 || j == arr[i].length - 1){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }

        for(int i = 0; i < arr.length;i++){
            for(int j = 0;j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
