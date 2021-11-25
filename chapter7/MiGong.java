public class MiGong {
    public static void main(String[] args) {
        /*
        1. �]�m�g�c
        2. 0���D���A1����ê��
        */ 

        int[][] map = new int[15][15];
        // �W�U���O��
        for(int i = 0; i < 15 ; i++){
            map[0][i] = 1;
            map[14][i] = 1;
        }
        //���k���O��
        for(int i = 0; i < 15 ; i++){
            map[i][0] = 1;
            map[i][14] = 1;
        }

        //�H����ê��
        map[1][10] = 1;
        map[1][11] = 1;
        map[1][12] = 1;
        map[1][13] = 1;
        for(int i = 0;i < 15; i++){
            if(i != 5){
                map[2][i] = 1;
            }
        }

        //��X�g�c�{��
        System.out.println("-----�g�c�{��-----");
        for(int i = 0;i < 15;i++){
            for(int j = 0; j < 15;j++){
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }

        //�Ыئѹ��� �éI�sfindWay()��k
        Mouse m = new Mouse();
        m.findWay(map, 1, 1);

        //��X�ѹ����g�c
        System.out.println("-----�ѹ����g�c-----");
        for(int i = 0;i < 15;i++){
            for(int j = 0; j < 15;j++){
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

//�g�@�Ӧѹ����AfindWay()��k
class Mouse{
    public boolean findWay(int[][] map , int i, int j){
        /*
        0. i , j ���_�l���y�Ц�m
        1. �_�l��m�� (1,1) ���I��(13,13)
        2. �ϥλ��j
        3. ������ �U�k�W�� -->�W�k�U��
        4. 0���D���A1����ê���A2�O�i�H���L�A3�O�i�H�����O����
        5. map[6][5] = 2 �Y�q�L�g�c
        */
        //�P�_�O�_�q�L�g�c�F
        if(map[13][13] == 2){
            return true;
        }else{
            //�P�_�O�_���D��
            if(map[i][j] == 0){
                //�����]�O�i�H����
                map[i][j] = 2;

                //�P�_�U�@�B�����̨�->�U�k�W�� �令�W�k�U��
                if(findWay(map, i-1, j)){ //top
                    return true;
                }else if(findWay(map, i, j+1)){ //right
                    return true;
                }else if(findWay(map, i+1, j)){ //down
                    return true;
                }else if(findWay(map, i, j-1)){ //left
                    return true;
                }else{
                    //�U�k�W���ҵL�k���\�P�w���������q
                    map[i][j] = 3;
                    return false;
                }
            }else{
                return false;
            }
        }
    }
}
