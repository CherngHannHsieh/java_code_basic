public class MethodDetail {
    public static void main(String[] args) {
        AA a = new AA();
        //�������ܼơA�ݻP��^���ƾګ��A�ۦP
        int[] answer = a.getSumSub(50, 40);
        for(int i = 0; i < answer.length ; i++){
            System.out.println(answer[i]);
        }

        a.say();
        a.b();
    }
}

class AA{
    public int[] getSumSub(int n1,int n2){
        //��^array �Y�i�@����^�h�ӭ�
        int[] res = new int[2];
        res[0] = n1 + n2;
        res[1] = n1 - n2;
        //�i�H��^����ƭȡA���L�ݭn�P��k���A�ۦP
        return res;
    }

    //�P��������k�A�i�����ե�
    public void print(int n){
        System.out.println(n);
    }

    public void say(){
        print(5);
    }

    public void b(){
        //�Ыحn�եΪ���L�� -> ���s��k
        //�����եλP�׹��Ŧ���
        System.out.println("------");
        B b1 = new B();
        b1.hi();
        System.out.println("------");
    }
}

class B{
    public void hi(){
        System.out.println("hi");
    }
}
