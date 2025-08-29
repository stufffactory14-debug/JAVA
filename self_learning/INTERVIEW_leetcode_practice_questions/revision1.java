import java.util.*;
public class revision1 {

    public static void main(String[] args) {
       // int[] arr = {1,2,3,4,5,6};
       // int target =5;
       // System.out.println(binary(arr,target));
      //  int [] gain = {-5,1,5,0,-7};
      //  System.out.println(Arrays.toString(largestAltitude(gain)));
        //int[][] image= {{1,1,0},{1,0,1},{0,0,0}};
       // System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
      /*  int[][] arr={
                {1,1},
                {0,0}
        };
        System.out.println(Arrays.deepToString(oddCells(2,2,arr)));*/
       /* int[] arr={9,9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(arr,1));*/
       /* int[][] arr={
                {0,0,0}
                ,{0,1,0,9,5}
                ,{1,1,1}};
        System.out.println(Arrays.deepToString(tanspose(arr)));*/

      //System.out.println(Arrays.deepToString(mat(3)));
//        int[] nums= {3,2,-5,-3};
//        System.out.println(maxAdjacentDistance(nums));
        //spiral matrix iii
       /* int[][] nums={
                {16,7,8,9},
                {15,6,1,2},
                {14,5,4,3},
                {13,12,11,10}};
        System.out.println(Arrays.deepToString(spiralMatrixIII(4,4,1,2)));

*/
       /* int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(nums));*/
        //zero matrix leetcode
       /* int[][] list = {{1,1,1},{1,0,1},{1,1,1}};
       setZeroes(list);*/

        //SELECTIONSORT
        /*int[] arr= {29,72,98,13,87};
         System.out.println(Arrays.toString(selection(arr)));*/

       /* int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));*/

        //canjump
        int[] nums={3,2,1,0,4};
        System.out.println(canJump(nums));
    }

    static int binary(int[] arr , int target){
        int start = arr[0];
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end - start)/2;
            if(target==arr[mid]){
                return mid;
            }else if (target>arr[mid]){
                start=mid+1;
            }else if (target<arr[mid]){
                end=mid-1;
            }
        }
        return -1;
    }
    static int[] largestAltitude(int[] gain) {
        int[] arr=new int[gain.length+1];
        arr[0]=0;
        for(int i=0;i<gain.length;i++){
            arr[i+1]=arr[i]+gain[i];
        }
        return arr;
    }

    static int[][] flipAndInvertImage(int[][] image) {

        for(int i=0;i<image.length;i++){
            int start=0;
            int end=image[i].length-1;
            while(start<end){
                int temp=image[i][start];
                image[i][start]=image[i][end];
                image[i][end]=temp;
                start++;
                end--;
            }
        }
        return image;
    }
/*    static int[][] oddCells(int m, int n, int[][] arr) {
        int[][] re= new int[m][n];
        for(int[] ans:arr){

        }
    }
    */

    static double addToArrayForm(int[] num, int k) {
        double sum=0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<num.length;i++){
            sum=sum*10+num[i];

        }
        sum+=k;

    return sum;
    }
    static int[][] tanspose(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[i].length;j++){
                int tem=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=tem;
            }
        }
        return arr;
    }
    //SPIRAL MATRIX 2 LEETCODE
    static int[][] mat(int n){

        int[][] ans = new int[n][n];
        int val=1;
        int rowstart=0;
        int rowend = ans.length-1;
        int colstart=0;
        int colend=ans[0].length-1;
        while(rowstart<=rowend && colstart<=colend){
            for(int i=colstart;i<=colend;i++){
                ans[rowstart][i]+= val++;
            }
            rowstart++;
            for(int i=rowstart;i<=rowend;i++){
                ans[i][colend]+= val++;

            }
            colend--;
            if(rowstart<=rowend){
                for(int i=colend;i>=colstart;i--){
                    ans[rowend][i]+= val++;
                }
                rowend--;
            }

            if(colstart<=colend){
                for(int i=rowend;i>=rowstart;i--){
                    ans[i][colstart]+= val++;
                }
                colstart++;
            }
        }


        return ans;
    }
    static int maxAdjacentDistance(int[] nums) {


        int index=nums[0];
        int adj=0;
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]) {
                adj = nums[i + 1] - nums[i];
            }
            else if(nums[i]>nums[i+1]) {
                adj = nums[i] - nums[i+1];
            }
            if(max<adj) {
                max = adj;
            }
        }
        if(nums[nums.length-1]>index) {
            adj=nums[nums.length-1]-index;
        }
        else if(nums[nums.length-1]<index) {
            adj=index-nums[nums.length-1];
        }

        if(max<adj){
            max=adj;
        }

        return max;
    }
//SPIRAL MATRIX III
static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
    int[][] direction = {
            {0,1},
            {1,0},
            {0,-1},
            {-1,0}
    };
    int[][] res=new int[rows*cols][2];
    res[0][0]=rStart;
    res[0][1]=cStart;
    int steps=1;
    int count=1;
    int index=0;
    while(count<rows*cols){
        for(int i=0;i<2;i++){
            int dr=direction[index%4][0];
            int dc=direction[index%4][1];
            for(int j=0;j<steps;j++){
                rStart+=dr;
                cStart+=dc;
                if(rStart<rows && rStart>=0 && cStart>=0 && cStart<cols){
                    res[count][0]=rStart;
                    res[count][1]=cStart;
                    count++;
                }

            }
            index++;

        }
        steps++;

    }
    return res;
}
//SPIRAL MATRIX

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rstart=0;
        int cstart=0;
        int rend=matrix.length-1;
        int cend=matrix[0].length-1;
        while(rstart<=rend && cstart<=cend){
            for(int i=cstart;i<=cend;i++){
                list.add(matrix[rstart][i]);
            }
            rstart++;
            for(int i=rstart;i<=rend;i++){
                list.add(matrix[i][cend]);
            }cend--;
            if(rstart<=rend){
                for(int i=cend;i>=cstart;i--){
                    list.add(matrix[rend][i]);
                }
                rend--;
            }
            if(cstart<=cend){
                for(int i=rend;i>=rstart;i--){
                    list.add(matrix[i][cstart]);
                }
                cstart++;
            }

        }
        return list;
    }
    static void setZeroes(int[][] matrix) {
        boolean[] r= new boolean[matrix.length];
        boolean[] c=new boolean[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    r[i]=true;
                    c[j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(r[i] || c[j]){
                    matrix[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
 //SELECTION SORT
    static int[] selection(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;

                }

            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        return arr;
    }
    static int[] productExceptSelf(int[] nums) {
        int[] prefix= new int[nums.length];
        int[] suffix= new int[nums.length];
        prefix[0]=1;
        int j=1;
        for(int i=0;i<nums.length-1;i++){
            prefix[j]=nums[i]*prefix[i];
            j++;
        }
        suffix[nums.length-1]=1;
        int index=nums.length-2;
        for(int i=nums.length-1;i>=1;i--){
            suffix[index]=nums[i]*suffix[i];
            index--;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=prefix[i]*suffix[i];
        }
        return nums;
    }
    //WRONG ANS ( SLOVE BY GREEDY )
    static boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int temp=nums[0];
        int j=1;
        for(int i=0;i<nums.length;i++){
            for(int index=0;index<temp;index++){
                temp=nums[j++];
                if(temp==nums[nums.length-1]){
                    return true;
                }
            }

        }
        return false;
    }

}

