import java.util.ArrayList;

public class REC_arrays {
    public static void main(String[] args) {
        int[] arr= {1,2,4,4,5,7,6,8};
        int[] bhav={4,5,6,7,1,2,3};
       // System.out.println(sorted(arr,0));
        // System.out.println(element2(arr,7,0));
        element3(arr,4,0);
        System.out.println(list);
        // System.out.println(binary(bhav,7,0,arr.length-1));
    }


    // check whether the number is sorted or not
    static boolean sorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
        //&& tab use kro jub 1st me true return ho arr<arr+1 wala jub true ho
    }

    //  Q2 search target element in array
    //TRUE OR FALSE IF IT IS EXISITS
    static boolean element(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || element(arr,target,index+1);
        //|| tab use kro jub 1st me false return ho arr==target wala jub false hoga tabhi recurtion call hoga
    }

    //Q2 SAME QUESTION NOW PRINTING INDEX
    static int element2(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return element2(arr,target,index+1);
        }
    }
    
    //  Q2 ADDING IN LIST
    static ArrayList<Integer> list = new ArrayList<>();
    static void element3(int[] arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }

        element3(arr,target,index+1);

    }

    //BINARY SEARCH BY RECURSION
    static int binary(int[] arr,int target , int s , int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        // YE TAB JUB HALF ARRAY KA SORTED HO LIKE {1,2,3,4}
        if(arr[s]<=arr[mid]){
            if (target >= arr[s] && target < arr[mid]) {
                return binary(arr, target, s, mid - 1);
            } else {
                return binary(arr, target, mid + 1, e);
            }
        }
        // YE TAB JUB RIGHT SORTED HO {3,4,5,1,2}
        if(target>arr[mid] && target <=arr[e]){
            return binary(arr,target,mid+1,e);
        }else{
           return binary(arr,target,s,mid-1);
        }
    }
}
