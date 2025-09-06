package backtracking;

import java.util.Arrays;

public class basic {
    public static void main(String[] args) {
//        int[] arr = insert(0,new int[5]);
//         for(int n:arr){
//             System.out.print(n+" ");
//         }

//permutation("","abc");
      //  substring1("","abc");
//        int n=4;
//        char[][] arr = new char[n][n];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                arr[i][j]='.';
//            }
//        }
//        queens(arr,0);
//        System.out.println("TOTAL WAYS TO SOLVE N QUEENS "+count);

        System.out.println(grid(0,0,3,3));
    }
    static int[] insert(int val,int[] arr){
        if(val==arr.length){
            return arr;
        }
        arr[val]=val+1;
        insert(val+1,arr);
        arr[val]=val-1;
        return arr;
    }

    static void substring1(String p,String un){
        if(un.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=un.charAt(0);
        substring1(p+ch,un.substring(1));
        substring1(p,un.substring(1));
    }

 static void permutation(String p,String un){
        if(un.isEmpty()){
            System.out.println(p);
            return;
        }

     for (int i = 0; i < un.length(); i++) {
         char ch = un.charAt(i);
         String o= un.substring(0,i) + un.substring(i+1);
         permutation(ch+p,o);
     }
 }

 static int count = 0;
    static boolean printonce=false;
  static void queens(char[][] arr,int row){

        if(row==arr.length){
            //printboard(arr);
            count++;
            printboard(arr);
            printonce=true;
            return;
        }
      for (int col = 0; col < arr.length; col++) {
         if(issafe(arr,row,col)){
             arr[row][col]='Q';
             queens(arr,row+1);
             arr[row][col]='.';
         }
      }

  }
  static void printboard(char[][] arr){
      if(printonce==false) {
          System.out.println("----- CHESS BOARD ---- ");
          for (int i = 0; i < arr.length; i++) {
              for (int j = 0; j < arr[i].length; j++) {
                  System.out.print(arr[i][j]);
              }
              System.out.println();
          }
      }
      }
  static boolean issafe(char[][] arr,int row,int col){
      for (int i = row-1; i >=0; i--) {
          if(arr[i][col]=='Q'){
              return false;
          }
      }

      for (int i = row-1,j=col-1; i>=0 && j>=0 ; i--,j--) {
          if(arr[i][j]=='Q'){
              return false;
          }
      }

      for (int i = row-1,j=col+1; i>=0 && j<arr.length ; i--,j++) {
          if(arr[i][j]=='Q'){
              return false;
          }
      }
      return true;
  }

  //GRID QUES
    static int grid(int i,int j,int m , int n){
      if(i==m-1 || j==n-1){
          return 1;
      }else if(i==m && j==n){
          return 0;
        }

      int g1=grid(i+1,j,m,n);
      int g2=grid(i,j+1,m,n);
      return g1+g2;
    }
}
