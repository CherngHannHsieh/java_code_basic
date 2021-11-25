public class VariableParameter {
    public static void main(String[] args) {
        Hsp hsp = new Hsp();
        System.out.println(hsp.sum(10,20,30,50,80));
        System.out.println(hsp.showScore("Kack", 50,60,70,80,90,100));
        
    }
}

class Hsp{
    //璸衡2 / 3 / 4 ....计
    //跑把计
    //1. int... ボ钡跑把计
    //2. ㄏノ跑把计 -> 讽计舱ㄏノ
    //3. 跑把计龟把琌计舱
    //4. 跑把计㎝炊硄摸把计癬跑把计ゲ斗程
    //5. 把い瞷跑把计 
    public int sum(int... nums){
        int res = 0;
        for(int i = 0; i < nums.length;i++){
            res += nums[i];
        }
        return res;
    }

    //﹎籔揭祘羆だ -> 跑把计纗揭祘だ计
    //才﹃(﹎ + 羆だ)
    public String showScore(String name,double... scores){
        double sum = 0;
        //跑把计跌计舱矪瞶
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        return name + "\t" + sum;
    }
}
