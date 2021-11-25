import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        /*
        ?b?@??????C???A?s?W???A?????G?????????C
        [10,12,45,90] -> [10,12,45,90,23]
        -> [10,12,23,45,90]
        1. scanner input
        2. ???->?G?????
        */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("????}?C?? [10,12,45,90]");
        System.out.print("???J???: ");
        //??????J
        int input = myScanner.nextInt(); 

        int[] arr = {10,12,45,90};
        int[] arrNew = new int[arr.length + 1];
        int[] arrFinal = new int[arr.length + 1];

        //?Narr?????arrNew
        for(int i = 0;i < arr.length; i++){
            arrNew[i] = arr[i];
        }

        //?N??J??[??arrNew?????
        arrNew[arrNew.length - 1] = input;

        //??j?p
        //?w??e????????}?C?i?滼?j
        int newIndex = 0;
        for(int i = 0;i < arrNew.length - 1;i++){
            //?s?[?J???????j??AnewIndex++
            if(arrNew[arrNew.length - 1] > arrNew[i]){
                newIndex++;
                continue;
            }
        }
        //?J???@????v?j?????A?s?W?@??arrFinal??NarrNew?i???s??C(??b?e????i?A?H??K?????}???)
        for(int j = 0;j < arrFinal.length;j++){
            //???v?p??????
            if(j < newIndex){
                arrFinal[j] = arrNew[j];
            }else if(j == newIndex){
                //?N??J??????J
                arrFinal[j] = arrNew[arrNew.length -1];
            }else{
                arrFinal[j] = arrNew[j-1];
            }
        }
        //??}
        arr = arrFinal;

        //output
        System.out.println("?s???}?C?p?U");
        for(int i = 0; i < arr.length ;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}

class Homework2 {
    public static void main(String[] args) {
        /*
        ????:?X?e+?w??
        1. ???T?w?K?[????n???J????
        2. ?M???X?e
        */
        int[] arr = {10,15,45,90};
        int index = -1; 

        Scanner myScanner = new Scanner(System.in);
        System.out.print("??J?@???: ");
        int num = myScanner.nextInt();

        //??s?W????i??w??
        for(int i = 0;i < arr.length ; i++){
            if(num <= arr[i]){
                // ?J???@????v?j?????A?N?h?X
                index = i;
                break;
            }
        }

        //??v?O??j??
        if(index == -1){
            index = arr.length;
        }

        //?X?e
        int[] arrNew = new int[arr.length + 1];
        // i ?w??arrNew?w??Aj?w??arr?w??
        for(int i = 0,j = 0; i < arrNew.length; i++){
            if(i != index){
                arrNew[i] = arr[j];
                j++;
            }else{
                arrNew[i] = num;
            }
        }
        arr = arrNew;
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}

class Homework3 {
    public static void main(String[] args) {
        /*
        1. 生成10個隨機數字(1-100)
        2. 倒序打印
        3. 平均值
        4. 最大值和最大值index
        5. 裡面有無8
        */
        int[] arr = new int[10];
        double aver = 0;
        boolean isEight = false;

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100 + 1);
            aver += arr[i];
            if(arr[i] == 8){
                isEight = true;
            }
        }

        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n----------");

        aver /= 10;

        for(int i = arr.length - 1;i >=0;i--){
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n----------");

        int max = arr[0];
        int maxIndex = 0;

        for(int i = 1;i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("max = " + max + ", maxIndex = " + maxIndex + "\n----------");

        for(int i = 0;i < arr.length - 1;i++){
            for(int j =0;j < arr.length - 1 - i;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n" + aver);
        System.out.println(isEight);
    }
}

class Homework4 {
    public static void main(String[] args) {
        //bubble sort 小到大
        int[] arr = {12,5,80,30,70,8,6};

        for(int i = 0; i < arr.length - 1;i++){
            for(int j = 0;j< arr.length - 1 - i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        for(int i = 0;i < arr.length ; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}