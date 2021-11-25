public class FourQueens {
    public static void main(String[] args) {
        //�إߤ@�� 4 * 4 ���ѽL
        int[][] board = new int[4][4];
        // 0 ���Ů�  1���ӦZ ��l�ƴѽL
        for(int i = 0; i < 4; i ++){
            for(int j = 0; j < 4; j++){
                board[i][j] = 0;
            }
        }

        System.out.println("\t===== �ѽL =====");
        for(int i = 0; i < 4; i ++){
            for(int j = 0; j < 4; j++){
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }

        //�Ы���
        Queen q = new Queen();
        q.putQueen(board);
        System.out.println("\t===== �ѽL =====");
        for(int i = 0; i < 4; i ++){
            for(int j = 0; j < 4; j++){
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

class Queen{
    // 4�ӦZ��m��k
    public boolean putQueen(int[][] board){
        // 4 * 4 �ѽL ��m4�ӦZ -> �C�@�泣�u�|���@�ӬӦZ
        // ���w�@�}�l���񥪤W
        // 0 ���Ů� 1���i�H��
        board[0][0] = 1;
        //�q�ĤG��̧ǩ��U�ˬd
        for(int i = 1;i < board.length ; i++){
            for(int j = 0; j < board[i].length;j++){
                //�����w�i�H��
                board[i][j] = 1;
                //�P��P�C�����
                if(i == 0 || j == 0){
                    board[i][j] = 0;
                }
            }
        }
        return true;
    }
}
