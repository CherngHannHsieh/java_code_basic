public class ArrayPractice {
    public static void main(String[] args){
        /*
        create a char array to save 26 element 'A'-'Z', use for loop
        1. declare a char[] , length = 26
        2. because 'A' + 1 = 'B', use for to assign value
        */
        char[] chars = new char[26];
        for(int i = 0; i < chars.length;i++){
            chars[i] = (char)('A' + i); //'A' + i is int, incompatible types: possible lossy conversion from int to char
            System.out.print(chars[i] + "\t");
        }
    }
}

class ArrayPractice2 {
    public static void main(String[] args){
        /*
        {4.-1.9.10.23} max -> index = ?
        1. declare int[] arr = {4,-1,9,10,23};
        2. assume max = arr[0]; 
        3. for loop , if max < arr[i] , max = arr[i];
        */
        int[] arr = {4,-1,9,10,23};
        int max = arr[0];
        int maxIndex = 0;
        for(int i = 1; i < arr.length ;i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println(max + "\t" + maxIndex);
    }
}
