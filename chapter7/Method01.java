public class Method01 {
    public static void main(String[] args) {
        //use method
        //�g�n��k�A���եΤ��|��X
        //�Ыع�H
        Person p = new Person();
        //�եΤ�k
        p.speak();
        p.cal01();
        p.cal02(5000); //call cal02, n = 5000
        //call getSum n1 =10, n2 = 20
        // getSum��^���� �ᤩ res
        int res = p.getSum(100, 20); 
        System.out.println(res);

    }
}

class Person{
    
    int age;
    String name;
    
    //Method
    //public ���} �A void �S����^�ȡAspeak() ��k�W
    public void speak(){
        System.out.println("good person");
    }

    public void cal01(){
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            sum += i;
        }
        System.out.println(sum);
    }
    // (int n) �ѼƦC�� �A��e���@�ӰѼ�n�A�i�H������J 
    public void cal02(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    // int ��k�����A��^int 
    //return res  ��res���Ȫ�^
    public int getSum(int n1,int n2){
        int res = n1 + n2; 
        return res;
    }

}