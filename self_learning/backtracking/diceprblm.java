package backtracking;

import java.util.ArrayList;

public class diceprblm {
    public static void main(String[] args) {
//this was amazon ques
        dice("",4);
        System.out.println( dicearray("",4));
    }
    static void dice(String p,int un){
       //base case
       if(un==0){
           System.out.println(p);
           return;
       }
        //recursion
        for (int i = 1; i <=6; i++) {
            if(i<=un){
             dice(p+i,un-i);
        }
        }
    }

    static ArrayList<String> dicearray(String p,int un){
        //base case
        if(un==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        //recursion
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <=6; i++) {
            if(i<=un){
                list.addAll(dicearray(p+i,un-i));
            }
        }
        return list;
    }


}
