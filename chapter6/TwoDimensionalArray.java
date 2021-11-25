public class TwoDimensionalArray {
    public static void main(String[] args) {
        // �G���}�C => �@���}�C������(��)�O�@�Ӥ@���}�C
        int[][] arr = {{0,0,0,0,0},{0,1,1,0,1},{1,2,3}};
        int count = 0;

        for(int i = 0; i < arr.length;i++){
            // ��i�Ӥ���(�}�C)������
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
        //�}�@�ӤG�� Array �A�� 10 ��element�A���C��element �٨S���]�w�@��Array
        int[][] arr = new int[10][];

        for(int i = 0 ; i < arr.length ; i++){
            //��a[i] �}�Ŷ��A�S���}�h�� null
            arr[i] = new int[i + 1];

            for(int j = 0; j < arr[i].length ; j++){
                arr[i][j] = i + 1;
            }
        }

        for(int i = 0; i < arr.length;i++){
            // ��i�Ӥ���(�}�C)������
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