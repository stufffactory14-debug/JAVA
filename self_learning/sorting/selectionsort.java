import java.util.Arrays;

//SELECTION SORT ALGORITHUM

public class selectionsort {
    public static void main(String[] args) {
//        int [] arr= {1,4,6,2,};
//        selection(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void selection(int[] arr){
//        for(int i=0; i<arr.length; i++){
//            int last = arr.length-i-1;
//            int maxval= getMaxIndex(arr,0,last);
//            swap(arr,maxval,last);
//        }
//    }
//    static int getMaxIndex(int [] arr,int start , int end){
//        int max= start;
//        for(int i=start ;i<=end; i++){
//        if(arr[max]<arr[i]) {
//            max = i;
//            }
//        }
//        return max;
//    }
//    static void swap(int[] arr, int first , int second){
//        int temp= arr[first];
//        arr[first]=arr[second];
//        arr[second] = temp;
//    }

        int[] arr= {9,6,3,2,7,8};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length-i-1;
            int maxval=getmaxint(arr,0,last);
            swap(arr,maxval,last);
        }
    }
    static int getmaxint(int[] arr,int start , int last){
        int max=start;
        for(int i=start; i<=last; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int end){
        int temp=arr[first];
        arr[first]= arr[end];
        arr[end]= temp;
    }

}
