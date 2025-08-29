import java.util.Arrays;

public class REC_BUBBLE_SELECTION_SORT_PATTERNS {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2,1};
        //  traiangle(4,0);
        //  traiangle2(4,0);
        //  bubblesort(arr,arr.length-1,0);
        //  System.out.println(Arrays.toString(arr));
        selectionsort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    //REVEERSE TRIANGLE
    static void traiangle(int row,int col){
        if(row==0){
            return;
        }
        if(row>col){
            System.out.print("*");
            traiangle(row,col+1);
        }
        else{
            System.out.println();
            traiangle(row-1,0);
        }
    }
    //NORMAL TRIANGLE
    static void traiangle2(int row,int col){
        if(row==0){
            return;
        }
        if(row>col){
            traiangle2(row,col+1);
            System.out.print("*");
        }
        else{
            traiangle2(row-1,0);
            System.out.println();
        }
    }

    static void bubblesort(int[] arr,int row,int col){
        if(row==0){
            return;
        }
        if(row>col){
            if(arr[col]>arr[col+1]){
                int temp = arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
            bubblesort(arr,row,col+1);
        }
        else{
            bubblesort(arr,row-1,0);
        }
    }

    static void selectionsort(int[] arr,int row,int col,int max){
        if(row==0){
            return;
        }
        if(row>col){
            if(arr[col]>arr[max]){
                selectionsort(arr,row,col,col);
            }
            else {
                selectionsort(arr,row,col + 1,max);
            }
        }
        else{
            int temp=arr[max];
            arr[max]=arr[row-1];
            arr[row-1]=temp;
            selectionsort(arr,row-1,0,0);
        }
    }
}
