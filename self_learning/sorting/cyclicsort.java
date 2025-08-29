import java.util.*;

//NOTE IF THE RANGE IS GIVVEN 1 TO N YOU HAVE TO USE CYCLIC SORT
//IF WE HAVE GIVEN A SORTED ARRAY THEN APPLY BINARY SEARCH

public class cyclicsort {
    public static void main(String[] args) {
  //  int [] arr={2,3,1,5,4}; // WE HAVE TO PUT THIS IN SERIES WITHOUT ANY MISSING NUMBER
        int [] arr ={0,5,3,2}; //USE TO FIND MISSING NUMBER
       System.out.println(cyclic(arr)); // use for run amazon question
//       cyclic(arr);                               //USE TO RUN ALGO
//        System.out.println(Arrays.toString(arr));

    }
//    static void cyclic(int[] arr){
//        int i=0;
//        while (i<arr.length){
//            int index= arr[i]-1;
//            if(arr[i] != arr[index]){
//                swap(arr,i,index);
//            } else{
//                i++;
//            }
//        }
//
//    }

 //     Q1    AMAZON QUESTION ON CYCLIC SORT

   static int cyclic(int [] arr ){
        int i=0;
        while(i<arr.length){
            int correct= arr[i];
            if(arr[i]<arr.length && arr[i]!= arr[correct]){
                swap(arr,i, correct);
            }else{
                i++;
            }
        }
        for(int j=0; j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
   }
    static void swap(int[] arr, int first,int last ) {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }

}


