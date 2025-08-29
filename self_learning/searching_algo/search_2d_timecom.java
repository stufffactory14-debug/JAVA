
import java.util.Arrays;

public class search_2d_timecom {
    public static void main(String[] args) {
    int[][] arr= {
            {13,14,15,16},
            {17,18,19,20},
            {21,22,23,24}
    };
        System.out.println(Arrays.toString(search(arr, 17)));

    }

    static int [] search(int [][] matrix , int target){
        int r=0;
        int c=matrix.length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[] {r,c};
            }
            if(matrix[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int [] {-1,-1};
    }
}
