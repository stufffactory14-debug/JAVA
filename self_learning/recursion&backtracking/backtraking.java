import java.util.ArrayList;
import java.util.Arrays;

public class backtraking {
    public static void main(String[] args) {
 //       System.out.println(count(3,3));
        //path("",3,3);
       // System.out.println(patharr("",3,3));
      //  System.out.println(pathdiagonal("",3,3));
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        //allpath("",board,0,0);
        int[][] path= new int[board.length][board[0].length];
        allpathprint("",board,0,0,path,1);
    }
    static int count(int row,int col){
        if(row==1 || col==1){
            return 1;
        }
        int left = count(row-1,col);
        int right =count(row,col-1);
        return left+right;
    }
    static void path(String p,int row,int col){
        if(row==1 && col==1){
            System.out.println(p);
            return;
        }
         if(row>1){
             path(p+"D",row-1,col);
         }if(col>1) {
            path(p + "R", row, col - 1);
        }

    }

    static ArrayList<String> patharr(String p, int row, int col){
        if(row==1 && col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row>1){
            list.addAll(patharr(p+"D",row-1,col));
        }if(col>1) {
            list.addAll(patharr(p + "R", row, col - 1));
        }
        return list;

    }

    static ArrayList<String> pathdiagonal(String p, int row, int col){
        if(row==1 && col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row>1){
            list.addAll(pathdiagonal(p+"V",row-1,col));
        }if(col>1) {
            list.addAll(pathdiagonal(p + "H", row, col - 1));
        }if(row>1 && col>1){
            list.addAll(pathdiagonal(p+"D",row-1,col-1));
        }
        return list;
    }

    static void allpath(String p,boolean[][] maze,int r ,int c){
        if(r==maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        //i am considuring this block in my path
        maze[r][c]=false;
        if(r<maze.length-1){
            allpath(p+"d",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allpath(p+"r",maze,r,c+1);
        }
        if(r>0){
            allpath(p+"u",maze,r-1,c);
        }
        if(c>0){
            allpath(p+"l",maze,r,c-1);
        }
        //this line is where the function will be over or returned
        //so before the function gets returned also remove the change that wew made by that fucntion
        maze[r][c]=true;
    }

    static void allpathprint(String p,boolean[][] maze,int r ,int c,int[][] path,int step){

        if(r==maze.length-1 && c== maze[0].length-1){
            path[r][c]=step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));

            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }
        //i am considuring this block in my path
        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1){
            allpathprint(p+"d",maze,r+1,c,path,step+1);
        }
        if(c<maze[0].length-1){
            allpathprint(p+"r",maze,r,c+1,path,step+1);
        }
        if(r>0){
            allpathprint(p+"u",maze,r-1,c,path,step+1);
        }
        if(c>0){
            allpathprint(p+"l",maze,r,c-1,path,step+1);
        }
        //this line is where the function will be over or returned
        //so before the function gets returned also remove the change that wew made by that fucntion
        maze[r][c]=true;
        path[r][c]=0;
    }
}
