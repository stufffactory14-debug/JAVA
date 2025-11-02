package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class problem2257 {
    static void main(String[] args) {
        int[][] guards={{0,0},{1,1},{2,3}};
        int[][] walls={{0,1},{2,2},{1,4}};
        System.out.println(countUnguarded(4,6,guards,walls));
     //   char[][] nums =countUnguarded(4,6,guards,walls);
       // print(nums);
   //     System.out.println(Arrays.deepToString());
    }
   static int countUnguarded(int m, int n, int[][] guards,int[][] walls) {
       char[][] arr = new char[m][n];
       for (int i = 0; i < m; i++) {
           for (int j = 0; j < n; j++) {
               arr[i][j] = 'y';
           }
       }
        for (int[] p : guards) {
            arr[p[0]][p[1]] = 'g';
        }for(int[] p:walls){
            arr[p[0]][p[1]]= 'w';
       }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]=='g'){
                    
                    for (int k = i-1; k >=0 ; k--) {
                        if(arr[k][j]=='g'||arr[k][j]=='w')break;
                        arr[k][j]='n';
                    }

                    for (int k = i+1; k <m ; k++) {
                        if(arr[k][j]=='g'||arr[k][j]=='w')break;
                        arr[k][j]='n';
                    }

                    for (int k = j-1; k >=0; k--) {
                        if(arr[i][k]=='g'||arr[i][k]=='w')break;
                        arr[i][k]='n';
                    }

                    for (int k = j+1; k < n; k++) {
                        if(arr[i][k]=='g'||arr[i][k]=='w')break;
                        arr[i][k]='n';
                    }


                }
            }
        }
        int count = 0;
        for(char[] row:arr){
            for(char col:row){
                if(col=='y'){
                    count++;
                }
            }
        }

       return count;
    }

    static void print(char[][] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
