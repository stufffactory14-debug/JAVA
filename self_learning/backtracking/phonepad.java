package backtracking;

import java.util.ArrayList;

public class phonepad {
    public static void main(String[] args) {
        //google question and leetcode que
        //phonepad("","13");
       // System.out.println(phonepadlist("","12"));
        System.out.println(leetcodephone("","23"));

    }
    static void phonepad(String p,String un){
        if(un.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        //recursive calls
        int digit = un.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a'+i);
            phonepad(p+ch,un.substring(1));
        }
    }

    static ArrayList<String> phonepadlist(String p, String un){
        if(un.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        //recursive calls

        int digit = un.charAt(0)-'0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a'+i);
            list.addAll(phonepadlist(p+ch,un.substring(1)));
        }
        return list;
    }

    //LEETCODE SOLUTION ASSUMING A TO BE START FROM 2 LIKE 2 = ABC 3=DEF
    static ArrayList<String> leetcodephone(String p, String un){
            if(un.isEmpty()){
                    ArrayList<String> list = new ArrayList<>();
                    list.add(p);
                    return list;
                }
                //recursive calls

                int digit = un.charAt(0)-'0';
                int start = (digit-2)*3;
                int end = (digit-1)*3;
                if(digit==7) end++;
                if(digit==8) {
                    start++;
                    end++;
                }
                if(digit==9) {
                    start+=1 ;
                    end +=2;
                }
                ArrayList<String> list = new ArrayList<>();
                for (int i = start; i < end; i++) {
                    char ch = (char) ('a'+i);
                    list.addAll(phonepadlist(p+ch,un.substring(1)));
                }
                return list;
            }
        }


