public class Homework04 {
    public static void main(String[] args) {
        A04 a = new A04();
        int[] arr = {1,2,3,4,5,6,7,8,9}; 
        //直接輸出arrNew 會顯示地址
        int[] arrNew = a.copyArr(arr);
        for(int i = 0; i < arrNew.length ; i++){
            System.out.print(arrNew[i] + " ");
        }
    }
}

class A04{
    public int[] copyArr(int[] arr){
        int[] arrNew = new int[arr.length];
        for(int i = 0; i < arr.length;i++){
            arrNew[i] = arr[i];
        }
        return arrNew;
    }
}