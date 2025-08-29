import java.util.Scanner;
public class phebonachi {
    public static void main(String[] args) {
        /*
        0 1 1 2 3 5 8 13
         */
        System.out.println("from which number you want print series");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int count = 2;
        while(count<=n){
            int temp =b;
            b= a+b;
            a=temp;
            count++;
        }
        System.out.println("the answer is :" +b);
    }
}
