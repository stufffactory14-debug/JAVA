package sorting;

import java.util.Arrays;

public class REC_MERGE_SORT {
    public static void main(String[] args) {
     /*   int[] arr={4,5,2,3,1};
        arr=mergesort(arr);
        System.out.println(Arrays.toString(arr));*/

            int[] arr = {4, 5, 2, 3, 1};
            mergeSort1(arr, 0, arr.length - 1);
            System.out.println(Arrays.toString(arr));



    }
    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length+second.length];
        int i=0,j=0,k=0;

        while(i<first.length && j<second.length){
            if(first[i]< second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        //IT MAY BE POSSIBLE THAT ONE ARRAY IS NOT COMPLETED
        //COPY THE REMAINING ELEMENTS 
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }

        public static void mergeSort1(int[] arr, int left, int right) {
            if (left >= right) {
                return;
            }

            int mid = left + (right - left) / 2;
            mergeSort1(arr, left, mid);
            mergeSort1(arr, mid + 1, right);

            merge1(arr, left, mid, right);
        }

        private static void merge1(int[] arr, int left, int mid, int right) {
            int[] temp = new int[right - left + 1];
            int i = left, j = mid + 1, k = 0;

            while (i <= mid && j <= right) {
                if (arr[i] <= arr[j]) {
                    temp[k++] = arr[i++];
                } else {
                    temp[k++] = arr[j++];
                }
            }

            while (i <= mid) {
                temp[k++] = arr[i++];
            }

            while (j <= right) {
                temp[k++] = arr[j++];
            }

            System.arraycopy(temp, 0, arr, left, temp.length);
        }

}
