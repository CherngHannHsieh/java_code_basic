public class ArrayCopy {
    public static void main(String[] args){
        int[] arr1 = {10,20,30};
        //½á¤©·sªº¦a§}
        int[] arr2 = new int[arr1.length];
        for(int i = 0;i < arr1.length ; i++){
            arr2[i] = arr1[i];
        }
        arr2[2] = 100;

        for(int i = 0;i < arr1.length ; i++){
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();
        for(int i = 0;i < arr2.length ; i++){
            System.out.print(arr2[i] + "\t");
        }
    }
}
