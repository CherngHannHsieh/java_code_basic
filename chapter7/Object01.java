public class Object01{
    public static void main(String[] args){
        //��ҤƤ@����
        //�Ыؤ@���ߡA�ýᤩcat1�Acat1�O��object
        Cat cat1 = new Cat();
        cat1.name = "�p��";
        cat1.age = 2;
        cat1.color = "��";
        //�ЫزĤG���ߡA�ýᤩcat2�Acat2�O��object
        Cat cat2 = new Cat();
        cat2.name = "�p��";
        cat2.age = 100;
        cat2.color = "��";

        System.out.println(cat1.name + "\t" + cat1.age + "\t" + cat1.color);

        System.out.println(cat2.name + "\t" + cat2.age + "\t" + cat2.color);
    }

}

//�w�q�@�ӿ���
class Cat{
    //�ݩ� �����ܶq
    String name;
    int age;
    String color;
}