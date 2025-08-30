public class recursionapnac {
    public static void main(String[] args) {
//        recur(10);
//        System.out.println();
//        series(10);
//        System.out.println(factorial(5));
        int[] arr = {3,8,5,7,5};
//        System.out.println(issorted(arr,0));
//        System.out.println(firstoccurence(arr,5,0));
//        System.out.println(lastoccurence(arr,5,arr.length-1));
//        System.out.println(lastoccurence2(arr,5,0));
//        System.out.println(power(2,4));
//         System.out.println(optimizepower(2,5));
//        System.out.println(tileprblem(3));
//        remove("bhavyagupptaa",0,new StringBuilder(""),new boolean[26]);
//        System.out.println(friendspairing(5));
//        bstring(3,0,"");
        indexofoccurence(arr,2,0);
    }
    static void recur(int n){
        if(n==0){
            return ;
        }
        //printing in reverse order using recursion
        System.out.print(n + " ");
        recur(n-1);
    }

    static void series(int n) {
        if (n == 0) {
            return;
        }
        series(n - 1);
        System.out.print(n + " ");
    }

    static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    static boolean issorted(int[] arr,int i){
        if(arr.length-1 == i){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
       return issorted(arr,i+1);
    }

    static int firstoccurence(int[] arr , int key,int i){
        if(arr.length-1<i){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccurence(arr,key,i+1);
    }

    static int lastoccurence(int[] arr,int key,int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastoccurence(arr,key,i-1);

    }
    //or
    static int lastoccurence2(int[] arr,int key , int i){
        if(i==arr.length){
            return -1;
        }
        int isfound= lastoccurence2(arr,key,i+1);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
    static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
    //O(LOGN) MORE OPTIMIZE
    static int optimizepower(int x,int n){
        if(n==0){
            return 1;
        }
        int power=optimizepower(x,n/2);
        int halfpower= power*power;
        if(n%2!=0){
            halfpower= x*halfpower;
        }
        return halfpower;
    }
    
    //TILE PROBLEM
    static int tileprblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        return tileprblem(n-1)+tileprblem(n-2);
    }
    //REMOVE DUPLICATES USING REC
    static void remove(String str,int index,StringBuilder newstr,boolean[] arr){
        if(index==str.length()){
            System.out.println(newstr);
            return;
        }
        char ch = str.charAt(index);
        if(arr[ch-'a']==true){
            remove(str,index+1,newstr,arr);
        }else{
            arr[ch-'a']=true;
            remove(str,index+1,newstr.append(ch),arr);
        }
    }
    //GOLDMAN COMPANY
    static int friendspairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //single pair is friendspairing(n-1)
        int s=friendspairing(n-1);
        //couple paring is n-1*friendsparing(n-2)
        int c=friendspairing(n-2);
        int total = n-1*c;

        int result = s+total;
        return result;

        //return friendspairing(n-1)+n-1*friendspairing(n-2);
    }
    //BINARY STRING ASKED IN PAYTM
    static void bstring(int n,int lastindex,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        bstring(n-1,0,str+"0");
        if(lastindex==0){
            bstring(n-1,1,str+="1");
        }
    }
    //how many time key is occured return index of that
    static void indexofoccurence(int[] arr,int key , int index){
        if(index==arr.length){
            return;
        }

        if(arr[index]==key){
            System.out.print(index);
        }
        indexofoccurence(arr,key,index+1);
    }
}

