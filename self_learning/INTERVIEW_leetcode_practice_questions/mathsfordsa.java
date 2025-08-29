import java.lang.Math;
import java.util.ArrayList;
public class mathsfordsa {

    public static void main(String[] args) {
        int n=36;
        fac1(n);

    }
    //TO FIND FACTORS OF N O(N) COMPLEXSITY
    static void fac(int n){
        for (int i = 1; i <=n; i++) {
            if(n% i==0){
                System.out.println(i + " ");
            }
        }
    }

    //FACTOR OF N BY O(SQRT(N))
    static void fac1(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <=Math.sqrt(n); i++) {
            if(n%i==0){
                if(n/i==i){
                    System.out.println(i+ " ");
                }
                else {
                    System.out.println(i + " ");
                    list.add(n/i);
                }
            }

        }
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.println(list.get(i) + " ");
        }
    }

}
