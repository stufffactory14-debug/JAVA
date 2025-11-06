package leetcode;

public class larget_old_num_1903 {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("4208"));
    }
    static String largestOddNumber(String num) {
        int j=-1;
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){
                j=i;
                break;
            }
        }
        String ans = "";
        for(int i=0;i<=j;i++){
            ans+=num.charAt(i);
        }
        return ans;

    }
}
