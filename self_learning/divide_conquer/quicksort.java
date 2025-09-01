package divide_conquer;

public class quicksort {
    public static void main(String[] args) {
//        int arr[] = {2,4,5,1,0};
//        quicksort(arr,0,arr.length-1);
//        for(int num:arr){
//            System.out.print(num+" ");
//        }

    }
    //PIVIT APPROCH
    static void quicksort(int[] arr,int start , int end){
        if(start>=end){
            return;
        }
        int pivit = findpivit(arr,start,end);
        quicksort(arr,start,pivit-1);
        quicksort(arr,pivit+1,end);

    }
    static int findpivit(int[] arr,int start,int end){
        int pivit=arr[end];
        int i=start-1;
        for (int j = start; j <end ; j++) {
            if(arr[j]<=pivit){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=pivit;
        arr[end]=arr[i];
        arr[i]=temp;
        return i;
    }
}

