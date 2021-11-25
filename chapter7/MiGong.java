public class MiGong {
    public static void main(String[] args) {
        /*
        1. 設置迷宮
        2. 0為道路，1為障礙物
        */ 

        int[][] map = new int[15][15];
        // 上下都是牆
        for(int i = 0; i < 15 ; i++){
            map[0][i] = 1;
            map[14][i] = 1;
        }
        //左右都是牆
        for(int i = 0; i < 15 ; i++){
            map[i][0] = 1;
            map[i][14] = 1;
        }

        //隨機障礙物
        map[1][10] = 1;
        map[1][11] = 1;
        map[1][12] = 1;
        map[1][13] = 1;
        for(int i = 0;i < 15; i++){
            if(i != 5){
                map[2][i] = 1;
            }
        }

        //輸出迷宮現狀
        System.out.println("-----迷宮現狀-----");
        for(int i = 0;i < 15;i++){
            for(int j = 0; j < 15;j++){
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }

        //創建老鼠類 並呼叫findWay()方法
        Mouse m = new Mouse();
        m.findWay(map, 1, 1);

        //輸出老鼠走迷宮
        System.out.println("-----老鼠走迷宮-----");
        for(int i = 0;i < 15;i++){
            for(int j = 0; j < 15;j++){
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

//寫一個老鼠類，findWay()方法
class Mouse{
    public boolean findWay(int[][] map , int i, int j){
        /*
        0. i , j 為起始的座標位置
        1. 起始位置為 (1,1) 終點為(13,13)
        2. 使用遞迴
        3. 策略為 下右上左 -->上右下左
        4. 0為道路，1為障礙物，2是可以走過，3是可以走但是死路
        5. map[6][5] = 2 即通過迷宮
        */
        //判斷是否通過迷宮了
        if(map[13][13] == 2){
            return true;
        }else{
            //判斷是否為道路
            if(map[i][j] == 0){
                //先假設是可以走的
                map[i][j] = 2;

                //判斷下一步往哪裡走->下右上左 改成上右下左
                if(findWay(map, i-1, j)){ //top
                    return true;
                }else if(findWay(map, i, j+1)){ //right
                    return true;
                }else if(findWay(map, i+1, j)){ //down
                    return true;
                }else if(findWay(map, i, j-1)){ //left
                    return true;
                }else{
                    //下右上左皆無法成功判定為死路路段
                    map[i][j] = 3;
                    return false;
                }
            }else{
                return false;
            }
        }
    }
}
