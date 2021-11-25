public class Homework02 {
    public static void main(String[] args) {
        String[] str = {"fafad","afadfa","adfadfadafq"};
        A02 a = new A02(str);
        System.out.println(a.find("adfadfadafq"));
    }
}

// §Î°Ñ (String , String[]) §óº}«G  
class A02{
    String[] str;

    public A02(String[] str){
        this.str = str;
    }

    public int find(String str){
        for(int i = 0;i<this.str.length;i++){
            if(this.str[i].equals(str)){
                return i;
            }
        }
        return -1;
    }
}
