public class HanoiTower {
    public static void main(String[] args) {
        Tower t = new Tower();
        t.move(3, '1', '2', '3');
    }
}

class Tower{
    // �L�l�� ��a,b,c 
    public void move(int num,char a,char b , char c){
        if(num == 1){
            System.out.println("�q" + a + "��" + c);
        }else{
            //�L�l�Ƥj��1�A����W�����L�l�z�Lc�𲾨줤��
            move(num - 1,a,c,b);
            //�� a�� �̤U�����Ӳ��� c ��
            System.out.println("�q" + a + "��" + c);
            //�⤤���𪺽L�l�z�La�𲾰ʦ�c��
            move(num-1,b,a,c);
        }
    }
}