package leetcode;

public class koko_eating_banana {


    public static void main(String[] args) {
        int[] piles= {30,11,23,4,20};
        System.out.println(minEatingSpeed(piles,5));

    }

    static int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for (int i = 1; i <piles.length; i++) {
            if(piles[i]>max){
                max=piles[i];
            }
        }
       int start=1;
        int result=0;
        while(start<=max){
            int mid=start+(max-start)/2;
            if(check(piles,h,mid)){
                result=mid;
                max=mid-1;
            }else{
                start=mid+1;
            }
        }
        return result;
    }

    static boolean check(int[] piles,int h,int mid){
        int hours=0;
        for(int p:piles){
            hours+=Math.ceil((double)p/mid);
        }
        if(hours>h){
            return false;
        }
        return hours<=h;
    }
}
