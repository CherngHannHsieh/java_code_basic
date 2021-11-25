public class ArrayAssign {
    public static void main(String[] args){
        //基本類型賦值，賦值方式為值傳遞(值拷貝)
        int n1 = 10;
        int n2 = n1;

        n2 = 80;
        System.out.println(n1);
        System.out.println(n2);

        //array默認下賦的值是地址，引用傳遞(地址拷貝)
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
