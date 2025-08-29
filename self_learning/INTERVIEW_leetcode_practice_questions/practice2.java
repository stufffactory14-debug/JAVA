public class practice2 {
    public static void main(String[] args) {
        int[] arr = {5,6,8,14,16,18};
    //    int[] arr = {99,67,54,43,6,5,4,3,1};
        int target =15;
        int ans = binaryop(arr,target);
        System.out.println(ans);


    }
    static int binaryop(int[] arr, int target){
        int start=0;
        int end =arr.length-1;
        boolean rev;
        if(start<end){
            rev=true;
        }
        else{
            rev=false;
        }

        while(start<=end){
            int mid = start +( end - start)/2;
            if (target==arr[mid]){
                return mid;
            }
           if(rev) {
               if (target > arr[mid]) {
                   start = mid + 1;
               } else if (target < arr[mid]) {
                   end = mid - 1;    
               }
           }
           else{
               if (target < arr[mid]) {
                   start = mid + 1;
               } else if (target > arr[mid]) {
                   end = mid - 1;
               }

           }
        }
        return start;
    }
}
