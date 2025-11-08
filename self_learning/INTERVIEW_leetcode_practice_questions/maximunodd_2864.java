package leetcode;

public class maximunodd_2864 {
    static void main(String[] args) {
        System.out.println(maximumOddBinaryNumber("11"));
    }
    static String maximumOddBinaryNumber(String s) {
        String j="";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
            j+="0";
        }

            j = j.substring(0, j.length() - 1) + "1";
            count--;

        for(int i=0;i<s.length()-1;i++){
            if (count > 0) {
                j = j.substring(0, i) + "1" + j.substring(i + 1);
                count--;
            }
        }



        return j;
    }
}
