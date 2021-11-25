public class VariableParameter {
    public static void main(String[] args) {
        Hsp hsp = new Hsp();
        System.out.println(hsp.sum(10,20,30,50,80));
        System.out.println(hsp.showScore("Kack", 50,60,70,80,90,100));
        
    }
}

class Hsp{
    //�i�H�p��2�� / 3�� / 4�� ....�ƪ��X
    //�i�ܰѼ�
    //1. int... ��ܥi�����i�ܰѼ�
    //2. �ϥΥi�ܰѼ� -> �i�H��@�Ʋըϥ�
    //3. �i�ܰѼƪ���ѥi�H�O�Ʋ�
    //4. �i�ܰѼƥi�H�M���q�����ѼƩ�@�_�A���i�ܰѼƥ�����b�̫᭱
    //5. �@�ӧΰѦC���u��X�{�@�ӥi�ܰѼ� 
    public int sum(int... nums){
        int res = 0;
        for(int i = 0; i < nums.length;i++){
            res += nums[i];
        }
        return res;
    }

    //��^�m�W�P�h���ҵ{���`�� -> �i�ܰѼ��x�s�h���ҵ{����
    //��^�r�Ŧ�(�m�W + �`��)
    public String showScore(String name,double... scores){
        double sum = 0;
        //�i�ܰѼƵ����ƲճB�z
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        return name + "\t" + sum;
    }
}
