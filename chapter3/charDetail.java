public class charDetail {
    public static void main(String[] args){
        char c1 = 97;
        System.out.println(c1);

        char c2 = 'a';
        System.out.println((int)c2);

        char c3 = '��';
        System.out.println((int)c3);

        char c4 = 35613;
        System.out.println(c4);

        System.out.println('a'+10); //107

        char c5 = 'b' + 1;
        System.out.println((int)c5);
        System.out.println(c5);
        // �x�s:�r��=>ascii=>�G�i��
        // Ū��:�G�i��=>ascii=>�r��
        // ascii 1 byte�A�u��128�Ӧr��
        // unicode 2 bytes�A�ݮeascii�A�C�Ӧr�ų��� 2 bytes
        // utf-8�A�ݮeascii�A�r�� 1 byte�A�~�r 3 bytes
    }
}
