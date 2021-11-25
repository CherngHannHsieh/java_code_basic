import java.util.Scanner;
public class ArrayCompute {
    public static void main(String[] args){
        /*
        1. 初始array
        2. 定義一個新 array
        3. 將原array copy到 新array
        4. 將新的值賦予新的array
        */
        int[] arr = {1,2,3};
        int[] arrNew = new int[arr.length + 1];
        int len = arr.length;
        for(int i = 0; i < len ; i++){
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = 4;
        arr = arrNew;
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}

class ArrayCompute2 {
    public static void main(String[] args){
        /*
        5. scanner input
        6. do while + break loop  
        */ 
        int[] arr = {1,2,3};
        Scanner myScanner = new Scanner(System.in);
        do{
            int[] arrNew = new int[arr.length + 1];
            for(int i = 0; i < arr.length ; i++){
                arrNew[i] = arr[i];
            }
            System.out.print("input number: ");
            int numInput = myScanner.nextInt(); // add element
            arrNew[arrNew.length - 1] = numInput;
            arr = arrNew;
            for(int i = 0; i < arr.length ; i++){
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
            System.out.print("continue...?(y/n) : ");
            char key = myScanner.next().charAt(0);
            if(key == 'n'){
                System.out.println("Break out the loop");
                break;
            }
        }while(true);
        
    }
}

class ArrayCompute3 {
    public static void main(String[] args){
        /*
        1. int[] arr = {1,2,3,4,5}
        1.1 scanner input
        1.2 do while break loop
        2. int[] arrNew = new int[arr.length - 1];
        3. for loop copy
        */

        int[] arr = {1,2,3,4,5};
        Scanner myScanner = new Scanner(System.in);

        do{
            if(arr.length == 1){
                System.out.println("Cannot minus");
                break;
            }

            int[] arrNew = new int[arr.length - 1];
            for(int i = 0; i < arrNew.length ; i++){
                arrNew[i] = arr[i];
            }

            for(int i = 0; i < arrNew.length ; i++){
                System.out.print(arrNew[i] + "\t");
            }

            System.out.println();
            System.out.print("continue minus ... ? (y/n) : ");
            char key = myScanner.next().charAt(0);
            if(key == 'n'){
                System.out.println("break the loop");
                break;
            }

            arr = arrNew;
        }while(true);
    }
}