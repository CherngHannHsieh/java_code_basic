public class Constructor01 {
    public static void main(String[] args) {
        Person01 p1 = new Person01(500, "WWHITE");
        System.out.println(p1.age);
        System.out.println(p1.name);
    }
}

/*
Constructor 
1. �O class ���@�دS���k�A�D�n�@�άO������s object ����l�� (�D�Ыطsobject�A�ӬO��l��object)
2. �W�ٻݻP���W�ۦP
3. �S����^�ȡA�]����g void
4. Constructor ���եάO�Ѩt�Χ�����
5. �b�Ы� object �ɡA�t�η|�۰ʽեθ������غc�l�������󪺪�l��
*/
class Person01{
    int age;
    String name;
    //�غc�l
    public Person01(int pAge,String pName){
        age = pAge;
        name = pName;
        System.out.println("�եΫغc�l���\�A�����磌�󪺪�l��");
    }
} 

class Dog{
    /*
    6. �S���w�q�غc�l�A�t�η|�۰ʥͦ��@���q�{�غc�l
    7. �w�q�F�غc�l�A�q�{�غc�l�|�Q�л\�A�L�k�A�ϥ��q�{�غc�l
       ���D�㦡���w�q�A�~��ϥ�
    */ 

    public Dog(){
        
    }

    public Dog(String dName){

    }
}