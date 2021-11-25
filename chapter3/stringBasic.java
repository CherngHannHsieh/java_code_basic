public class stringBasic{
    public static void main(String[] args){
        int n1 = 1;
        float f1 = 1.1f;
        double d1 = 2.5;
        boolean b1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

        String s5 = "123";
        int i = Integer.parseInt(s5);
        double d = Double.parseDouble(s5);
        float f = Float.parseFloat(s5);
        long l = Long.parseLong(s5);
        byte b = Byte.parseByte(s5);
        boolean bb = Boolean.parseBoolean("true");
        short s = Short.parseShort(s5);
        System.out.println(i);
        System.out.println(d);
        System.out.println(f);
        System.out.println(l);
        System.out.println(b);
        System.out.println(bb);
        System.out.println(s);

        //String -> char，把字符串第n個字符取出
        System.out.println(s5.charAt(1));
    } 
}