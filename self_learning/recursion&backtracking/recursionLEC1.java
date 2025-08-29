import java.lang.Math;
public class recursionLEC1 {
    public static void main(String[] args) {
     //   series(5);
     //   reverse(6);
     //   System.out.println(sumofnumber(1342));
     //   System.out.println(productofnumber(1324));
    //    postdecre(5);
       //     fullreverse(1221);
        //    System.out.println(sum);
      //  System.out.println(second(1342));
        //  System.out.println(palendrome(1331));
        //  System.out.println(count(102030));
        System.out.println((totalsteps(14)));
    }

    static void series(int n) {
        if (n == 0) {
            return;
        }
        series(n - 1);
        System.out.print(n + " ");
    }

    static void reverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        reverse(n - 1);
    }

    static int sumofnumber(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumofnumber(n / 10);
    } 

    static int productofnumber(int n) {
        if (n == 1) {
            return 1;
        }
        return (n % 10) * productofnumber(n / 10);
    }

    static void postdecre(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        postdecre(--n);
    }

    static int sum=0;
    static void fullreverse(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum=sum*10+rem;
        fullreverse(n/10);
        // ye niche wali 2 line palendrome ke liye h and ye hta de to reverse of a number ajayega
        if(sum==n){
            System.out.println("palendrome");
        }
    }

    //YE CHATGPT SE SMJHNA H 2ND WAY OF FULL REVERSE
    static int second(int n){
        int digits =(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    private static int helper(int n , int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
    //for palendrome using helper function
    static boolean palendrome(int n){
        return n==second(n);
    }

    //COUNT NUMBER OF ZERO USING RECURSION
    static int count(int n){
        return helper2(n,0);
    }
    static int helper2(int n , int c){
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return helper2(n/10,c+1);
        }
        return helper2(n/10,c);
    }
    //LEETCODE PROBLEM
    //in one step ,if the current number is even divide it by 2 and if it is odd -1 from it and count number of steps
    static int totalsteps(int n){
        return helper3(n,0);
    }
    static int helper3(int n,int steps){
        if(n==0){
            return steps;
        }
        if(n%2==0){
            return helper3(n/2,steps+1);
        }
        return helper3(n-1,steps+1);
    }






}
