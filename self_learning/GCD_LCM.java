public class GCD_LCM {
    public static void main(String[] args) {
       // System.out.println(gcd(5,7));
        System.out.println(lcm(3,5));
    }
    // if 4a+8b=12( in this highest comman factor is 4) and if 5a+7b=13 ( in it highest comman factor is 1)
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    //lowest comman factor
    static int lcm(int a,int b){
        return a*b / gcd(a,b);
    }
}
