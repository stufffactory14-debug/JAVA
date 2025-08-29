import java.util.Scanner;

public class patterns {
    // PATTERN NO 1
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//       int n=4;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    // PATTERN No 2
//    static void lakhan(int n){
//    for(int row=1; row<=n; row++){
//        for(int col=1; col<=n; col++){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
//    }
//    public static void main(String[] args) {
//        lakhan(5);
//
//    }
//    static void bhavya(int n){
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=n-row+1; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        bhavya(4);
//    }

    // TRICKY PATTERN 4
//
//    public static void main(String[] args) {
//        op(5);
//    }
//
//    static void op(int n) {
//        for (int row = 1; row <= n * 2 ; row++) {
//            int colf = row > n ? 2 * n - row  : row;
//            for (int col = 1; col <= colf; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    //TRANGLE UPSIDE DOWN PATTERN
//    public static void main(String[] args) {
//        lak(5);
//    }
//    static void lak(int n){
//        for (int i=1; i<=n*2;i++){
//            int bha= i>n ? n*2-i:i;
//            int no= n-bha;
//            for (int z = 0; z < no; z++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=bha ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    public static void main(String[] args) {
        bhaw(5);
    }
    static void bhaw(int n){
        for (int row = 1; row <=2*n ; row++) {
            int niche= row>n ? 2*n-row:row;
            for (int space = 0; space < n-niche; space++) {
                System.out.print("  ");
            }
            for(int col=niche; col>=1;col--){
                System.out.print(col+" ");
            }
            for (int col =2; col <=niche ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();

            }

        }

    }


