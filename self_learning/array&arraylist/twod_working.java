import java.util.Scanner;

public class twod_working {
    public static void main(String[] args) {
        int[][] arr = {{5,3,4},{7,87,3},{24,5,76,98}};
        int target = 87;
        boolean found = false;
        for (int row=0; row<arr.length; row++){
            for (int col=0; col<arr[row].length; col++){
              if(arr[row][col]== target){
                  System.out.println("index of row is "+ (row+1)+ " index of colum is "+ (col+1));
                  found = true ;
                  break;
               }
                if(found) break;
            }

        }
    }
}
