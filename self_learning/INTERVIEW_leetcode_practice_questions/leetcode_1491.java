package leetcode;
import java.util.*;
public class leetcode_1491 {
    static void main(String[] args) {
        int[] salary={4000,3000,1000,2000};
        System.out.println(average(salary));
    }
    static double average(int[] salary) {
        Arrays.sort(salary);
        int start=1;
        int end=salary.length-2;
        double result=0;
        while(start<=end){
            if(start==end){
                result+=salary[start];
            }
            result+=salary[start]+salary[end];
            start++;
            end--;
        }
        double ans =  result/((salary.length)-2);
        return ans;

    }
}
