public class BubbleSort {
    public static void main(String[] args) {
        /*
        [24,69,80,57,13]
	
        �Ĥ@�� : ��̤j�Ʃ�b�̫�
        �Ĥ@����� : [24,69,80,57,13]
        �ĤG����� : [24,69,80,57,13]
        �ĤT����� : [24,69,57,80,13]
        �ĥ|����� : [24,69,57,13,80] 

        �ĤG�� : ��ĤG�j�Ʃ�b�˼ƲĤG
        �Ĥ@����� : [24,69,57,13,80]
        �ĤG����� : [24,57,69,13,80]
        �ĤT����� : [24,57,13,69,80]

        �ĤT�� : ��ĤT�j�Ʃ�b�˼ƲĤT
        �Ĥ@�� : [24,57,13,69,80]
        �ĤG�� : [24,13,57,69,80]

        �ĥ|��
        �Ĥ@�� : [13,24,57,69,80]

        */
         
        //�C����@�� ������Ƥ֤@
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
