import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
//    int[] arr={1,5,4,75,7};
//    bubble(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void bubble(int[] arr){
//        int temp;
//        for(int i=0; i<arr.length; i++){
//            boolean swapped= false;
//            for(int j=1; j<arr.length-i; j++){
//                if (arr[j] < arr[j-1]) {
//                    //then swap
//                    temp=arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
//                swapped = true;
//                }
//            }
//            if(!swapped){
//                break;
//            }
//        }

        //BUBBLE SHORT PRACTICE
        int [] arr={9,5,3,6,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
