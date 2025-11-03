package greedy;
import java.util.*;
public class activity_selection {
    static void main(String[] args) {
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};
        //end time basic sorted

        //if end is not sorted
        int[][] index= new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            index[i][0]=i;
            index[i][1]=start[i];
            index[i][2]=end[i];


        }
        int maxact=0;
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(index,Comparator.comparingDouble(a->a[2]));
        //1st act
        maxact=1;
        ans.add(index[0][0]);
        int lastEnd=index[0][2];

        for (int i = 1; i < index.length; i++) {
            if(lastEnd<=index[i][1]){
                maxact++;
                ans.add(index[i][0]);
                lastEnd=index[i][2];
            }
        }
        System.out.println(maxact);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }

}
