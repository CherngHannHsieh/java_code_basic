public class ArrayReverse {
    public static void main(String[] args){
        int[] arr = {11,22,33,44,55,66};
        /*
        1. arr[0] arr[5] change
        2. arr[1] arr[4] change
        3. arr[2] arr[3] change
        4. change 3 times -> arr.length/2
        5. arr[i] arr[arr.length - 1 - i]
        */
        int temp = 0;
        int len = arr.length;
        for(int i = 0; i < len/2 ;i++){
            temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }
        for(int i = 0;i < len;i++){
            System.out.print(arr[i] + " ");
        }

        
    }
}
