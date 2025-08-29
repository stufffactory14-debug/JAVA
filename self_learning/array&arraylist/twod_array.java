import java.util.Scanner;

public class twod_array {
    public static void main(String[] args) {
        int[][] twodarray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int targte = 9;
        boolean found = false;

        for (int row = 0; row < twodarray.length; row++) {
            for (int col = 0; col < twodarray[row].length; col++) {
                if (twodarray[row][col] == targte) {
                    System.out.println("got the answer at row " + (row + 1) + " colum is " + (col + 1));
                    found = true;
                    break;
                }
                if (found) break;
            }
        }

        //CODE FOR TAKING INPUT FROM THE USER FOR 2 D ARRAY AND PRINT IT
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + ",");
            }
            System.out.println();
        }
    }
}




