package backtracking;


public class sudoku {
    public static void main(String[] args) {
        int[][] sudoku = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},

                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(sudokusolve(sudoku,0,0)){
            printboard(sudoku);
        }else{
            printboard(sudoku);
        }
    }
static boolean solved = false;
    static boolean sudokusolve(int[][] sudoku,int row , int col){
        //base case
        if(row==9){
            solved = true;
            return true;
        }
        //recursion
        int nextrow=row,nextcol=col+1;
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;
        }
        if(sudoku[row][col]!=0){
            return sudokusolve(sudoku,nextrow,nextcol);
        }
        for(int digit=1;digit<=9;digit++){
            if(issafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                sudokusolve(sudoku,nextrow,nextcol);
                if(solved){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }

    static boolean issafe(int[][] board,int row,int col,int digit){
        //check for column
        for(int j=0;j<=8;j++){
            if(board[j][col]==digit){
                return false;
            }
        }

        //check for row
        for(int i=0;i<=8;i++){
            if(board[row][i]==digit){
                return false;
            }
        }

        //check for grid
        //formula for grid is (row/3)*3 and (col/3)*3
        int sr=(row/3)*3;
        int sc=(col/3)*3;

        for (int i = sr; i < sr+3 ; i++) {
            for (int j = sc; j < sc+3; j++) {
                if(board[i][j]==digit){
                    return false;
                }
            }
        }
    return true;
    }

    static void printboard(int[][] sudoku){
        for (int i = 0; i < 9 ; i++) {
            System.out.print("{");
            for (int j = 0; j < 9 ; j++) {
                System.out.print(sudoku[i][j]);
                if (j < 8) System.out.print(", ");

            }
            System.out.println("}");
        }

    }
}
