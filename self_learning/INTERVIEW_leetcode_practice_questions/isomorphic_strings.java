package leetcode;

public class isomorphic_strings {
    static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }
    static boolean isIsomorphic(String s, String t) {
        int[] arr=new int[128];
        int[] nums=new int[128];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch1=t.charAt(i);
            if(arr[ch]==0 && nums[ch1]==0){
                arr[ch]=ch1;
                nums[ch1]=ch;
            }else if(arr[ch]!=ch1){
                return false;
            }
        }
        return true;
    }
}
