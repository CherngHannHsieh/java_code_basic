public class HanoiTower {
    public static void main(String[] args) {
        Tower t = new Tower();
        t.move(3, '1', '2', '3');
    }
}

class Tower{
    // 盤子數 塔a,b,c 
    public void move(int num,char a,char b , char c){
        if(num == 1){
            System.out.println("從" + a + "到" + c);
        }else{
            //盤子數大於1，先把上面的盤子透過c塔移到中間
            move(num - 1,a,c,b);
            //把 a塔 最下面那個移到 c 塔
            System.out.println("從" + a + "到" + c);
            //把中間塔的盤子透過a塔移動至c塔
            move(num-1,b,a,c);
        }
    }
}