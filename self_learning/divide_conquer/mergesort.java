package divide_conquer;

public class mergesort {

    public static void main(String[] args) {
        int[] arr = {6,3,2,5,4};
        mergersort(arr,0,arr.length-1);
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void mergersort(int[] arr, int start , int end){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
        if(start>=end){
            return;
        }

        int mid = start + (end-start)/2;
        mergersort(arr,start,mid);
        mergersort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    static void merge(int[] arr ,int start , int mid , int end){
        int[] temp= new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }

        //if any one of the loop ends then
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }

        for (int l = 0; l < temp.length; l++) {
            arr[start+l]=temp[l];
        }
    }
}
