public class YangHui {
    public static void main(String[] args) {
        /*
        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1
        1 5 10 10 5 1

        1. ��n�榳n�Ӥ���
	    2. �C�@�檺�Ĥ@�өM�̫�@�Ӥ������O1

        �n�D:10�淨���T��
        */

        int[][] arr = new int[15][];
        for(int i = 0; i < arr.length ; i++){
            //���C�Ӥ����Ŷ�
            arr[i] = new int[i+1];
            //��ȡAfor loop
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
