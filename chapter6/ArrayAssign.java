public class ArrayAssign {
    public static void main(String[] args){
        //��������ȡA��Ȥ覡���ȶǻ�(�ȫ���)
        int n1 = 10;
        int n2 = n1;

        n2 = 80;
        System.out.println(n1);
        System.out.println(n2);

        //array�q�{�U�᪺�ȬO�a�}�A�ޥζǻ�(�a�}����)
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;

        arr2[0] = 100;
        for(int i = 0; i < arr1.length ; i++){
            System.out.println(arr1[i]);
        }
        for(int i = 0; i < arr2.length ; i++){
            System.out.println(arr2[i]);
        }
        System.out.println(arr1);
        System.out.println(arr2);
    }
}
