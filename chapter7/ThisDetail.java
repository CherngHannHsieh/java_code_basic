public class ThisDetail {
    public static void main(String[] args) {
        T t1 = new T();
        t1.f2();
        t1.f3();
    }
}

class T{
    String name = "ff";
    int age = 50;

    /*
    �X�ݫغc�l��k this(�ѼƦC��)
    �u��b�غc�l���ϥ�(�b�غc�l���X�ݥt�@�ӫغc�l)
    �`�N: �X�ݫغc�l���y�k������m�b�Ĥ@�y
    */

    public T(){
        //�o�̥h�X�� T(int a,int b) �غc�l
        this("jacj",50);
        System.out.println("T() �غc�l");
    }

    public T(String name,int age){
        System.out.println("T(int a,int b) �غc�l");
    }

    // �X�ݦ�����k���y�k this.��k�W(�ѼƦC��)
    public void f1(){
        System.out.println("f1() method");
    }

    public void f2(){
        System.out.println("f2() method");
        //�X�ݦ�����k
        //1.
        f1();
        //2.
        this.f1();
    }

    public void f3(){

        String name = "we";
        int age = 100;
        //�@�ΰ����Y�A�N��
        System.out.println(name + "\t" + age);
        //�z�Lthis�ӳX�ݥ������ݩʡA��i�N�ΰ�(�����ܶq)�ǽT�����������ݩ�
        System.out.println(this.name + "\t" + this.age);
    }
}