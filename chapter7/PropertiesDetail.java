public class PropertiesDetail {
    public static void main(String[] args) {
        //�Ы�Person��H
        //p1 �O ��H�W(��H�ޥ�)
        //new Person() �Ыت�����H�Ŷ�(�ƾ�)�A�~�O�u������H
        Person p1 = new Person();

        //��H���q�{�ȡA��uarray�W�h
        System.out.println(p1.age);
        System.out.println(p1.name);
        System.out.println(p1.sal);
        System.out.println(p1.isPass);
    }
}

class Person{
    int age;
    String name;
    double sal;
    boolean isPass;
}