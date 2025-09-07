package arraylist;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class findmax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

      //  System.out.println(getmax(list));
     swap(list,1,3);

        //asc order sort
        Collections.sort(list);

        //desc order sort
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // craete 2d array list
        //2d arraylist
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <=5 ; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        System.out.println(mainlist);

        //print arraylist
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> sub= mainlist.get(i);
            for (int j = 0; j < sub.size(); j++) {
                System.out.print(sub.get(j)+" ");
            }
            System.out.println();
        }

    }
    static int getmax(ArrayList<Integer> list){
        int max=list.get(0);
        for (int i = 1; i <list.size() ; i++) {
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        return max;
    }
    static void swap(ArrayList<Integer> list,int index1,int index2){
        int temp=list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }


}
