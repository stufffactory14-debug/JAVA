public class leetcodepb2
{
    public static void main(String[] args)
    {
        char[] arr = {'c','d','g'};
    char target = 'a';
    char ans= prbl(arr,target);
        System.out.println(ans);
}
static char prbl(char[] arr, char target){
    int start=0;
    int end = arr.length-1;
    while(start<=end){
        int mid= start + (end - start )/2;
        if(target<arr[mid]) {
            end = mid - 1;
        }
        else if(target>arr[mid]) {
            start = mid + 1;
        }
    }
    return (char) start;
}
}
