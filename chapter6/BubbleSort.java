public class BubbleSort {
    public static void main(String[] args) {
        /*
        [24,69,80,57,13]
	
        第一輪 : 把最大數放在最後
        第一次比較 : [24,69,80,57,13]
        第二次比較 : [24,69,80,57,13]
        第三次比較 : [24,69,57,80,13]
        第四次比較 : [24,69,57,13,80] 

        第二輪 : 把第二大數放在倒數第二
        第一次比較 : [24,69,57,13,80]
        第二次比較 : [24,57,69,13,80]
        第三次比較 : [24,57,13,69,80]

        第三輪 : 把第三大數放在倒數第三
        第一次 : [24,57,13,69,80]
        第二次 : [24,13,57,69,80]

        第四輪
        第一次 : [13,24,57,69,80]

        */
         
        //每比較一輪 比較次數少一
        int[] arr = {24,69,80,57,13,100,500,-80,-8,59};
        int temp = 0;
        int count = 0;

        for(int i = 0; i < arr.length - 1 ; i++){

            for(int j = 0 ; j < arr.length - 1 ; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            for(int j = 0 ; j < arr.length; j++){
                System.out.print(arr[j] + "\t");
            }
            System.out.println();

            for(int j = 0; j < arr.length -1 ; j++){
                if(arr[j] < arr[j+1]){
                    count++;
                };
            }

            if(count == arr.length - 1){
                break;
            }else{
                count = 0;
            }
            
        }
    }
}
