class Solution {
    
    int[][] directions =  {{-1, -1}, // top-left
                             {-1, 0},  // top
                             {-1, 1},  // top-right
                             {0, -1},  // left
                             {0, 1},   // right
                             {1, -1},  // bottom-left
                             {1, 0},   // bottom
                             {1, 1}};  // bottom-right
    
    public void gameOfLife(int[][] board) {

        int m = board.length;
        int n = board[0].length;
        performGameOfLife(board, m, n);
        updateGame(board, m, n);
    }
    
    public void performGameOfLife(int[][] board, int m, int n){
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                
                int alive = findAlives(board, m, n, i, j);
                if(board[i][j] == 0 && alive == 3){
                    board[i][j] = 2;
                }
                else if(board[i][j] == 1 && (alive == 2 || alive == 3)){
                    board[i][j] = 3;
                }
            }
        }
    }
    
    
    
    public int findAlives(int[][] board, int m, int n, int i, int j){
        int alive = 0;
        for(int dir[]: directions){
            int xdir = i + dir[0];
            int ydir = j + dir[1];
            
            if(!outOfbounds(m, n, xdir, ydir))
                alive += board[xdir][ydir] & 1;
            
        }
        
        
        return alive;
    }
    
    
    public boolean outOfbounds(int m, int n, int xdir, int ydir){
        boolean finalAnswer = (xdir<0 || xdir>=m || ydir<0 || ydir>=n);
        return finalAnswer;
    }
    
    public void updateGame(int[][] board, int m, int n){
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                board[i][j] >>= 1;
            }
        }
    }
}