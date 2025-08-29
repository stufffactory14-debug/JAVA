public class bitmanuplation {

    public static void main(String[] args) {
       // System.out.println(clearith(15,2));
        System.out.println(setith(10,2));
        System.out.println(clearibit(10,2,4));
        System.out.println(ispower(2));
        System.out.println(countsetbit(10));
        System.out.println(fastexpo(5,3));
//        int a=1;
//        int b=5;
//        int c=2;
//        int discriminant = b*b-4*a*c;
//        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
//        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
//        System.out.println(root1 + " " + root2);
    }
    static int getith(int n,int i){
        int bitmask = 1<<i;
       if((n&bitmask)==1){
           return 1;
       }else{
           return 0;
       }
    }

    static int setith(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    static int clearith(int n,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }
    static int updateith(int n,int i,int newbit){
        if(newbit==0){
            return clearith(n,i);
        }else{
            return setith(n,i);
        }
    }

    static int clearlast(int n,int i){
        int bitmask=-1<<i;
        return n&bitmask;
    }

    static int clearibit(int n,int i,int j){
        int a=((~0)<<j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
    static boolean ispower(int n){
        return (n&(n-1))==0;
    }

    static int countsetbit(int n){
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    static int fastexpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans*=a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

}


