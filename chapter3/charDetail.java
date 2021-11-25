public class charDetail {
    public static void main(String[] args){
        char c1 = 97;
        System.out.println(c1);

        char c2 = 'a';
        System.out.println((int)c2);

        char c3 = '谅';
        System.out.println((int)c3);

        char c4 = 35613;
        System.out.println(c4);

        System.out.println('a'+10); //107

        char c5 = 'b' + 1;
        System.out.println((int)c5);
        System.out.println(c5);
        // 纗:才=>ascii=>秈
        // 弄:秈=>ascii=>才
        // ascii 1 byteノ128才
        // unicode 2 bytes甧ascii–才常 2 bytes
        // utf-8甧asciiダ 1 byte簙 3 bytes
    }
}
