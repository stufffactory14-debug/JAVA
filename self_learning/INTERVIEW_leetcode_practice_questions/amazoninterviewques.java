// VIDEO KUNAL JAVA DSA BINARY SEARCH INTERVIEW QUESTION

public class amazoninterviewques {
    public static void main(String[] args) {
        int[] arr= { 1,2,9,10,11,12
                ,13,19,20,50,200};
        int target=10;
        System.out.println(ans(arr,target));
    }
    // QUESTION SAYS THAT THE ARRYA IS INFINITE SO WE CANT USE ARR.LENGTH
    public static int ans(int[] arr , int target){
        int start=0;
        int end =1;
        while(target>arr[end]){
            int temp= end +1;
            end = end +(end - start +1)*2;
            start=temp;
        }
        return(binaryop(arr,target,start,end));

    }

    public static int binaryop(int[] arr , int target , int start , int end){
        while(start<=end){
            int mid = start +(end - start)/2;
            if(target>arr[mid]){
                start= mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }


}
