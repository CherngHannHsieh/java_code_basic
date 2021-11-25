public class FourQueens {
    public static void main(String[] args) {
        //建立一個 4 * 4 的棋盤
        int[][] board = new int[4][4];
        // 0 為空格  1為皇后 初始化棋盤
        for(int i = 0; i < 4; i ++){
            for(int j = 0; j < 4; j++){
                board[i][j] = 0;
            }
        }

        System.out.println("\t===== 棋盤 =====");
        for(int i = 0; i < 4; i ++){
            for(int j = 0; j < 4; j++){
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }

        //創建類
        Queen q = new Queen();
        q.putQueen(board);
        System.out.println("\t===== 棋盤 =====");
        for(int i = 0; i < 4; i ++){
            for(int j = 0; j < 4; j++){
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

class Queen{
    // 4皇后放置方法
    public boolean putQueen(int[][] board){
        // 4 * 4 棋盤 放置4皇后 -> 每一行都只會有一個皇后
        // 假定一開始都放左上
        // 0 為空格 1為可以放
        board[0][0] = 1;
        //從第二行依序往下檢查
        for(int i = 1;i < board.length ; i++){
            for(int j = 0; j < board[i].length;j++){
                //先假定可以放
                board[i][j] = 1;
                //同行同列不能放
                if(i == 0 || j == 0){
                    board[i][j] = 0;
                }
            }
        }
        return true;
    }
}
