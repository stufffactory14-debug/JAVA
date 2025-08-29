public class v34_google_PHONENUMque {
    public static void main(String[] args) {
       // phone("","12");
        dice("",4);
    }
    static void phone(String p,String un){
        if (un.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit =un.charAt(0)-'0'; // coverts '2' into 2
        for(int i=(digit-1)*3;i<digit*3;i++){
            if (i==26){
                break;
            }
            char ch = (char)('a'+i);
            phone(p+ch,un.substring(1));
        }
    }
    //DICE PROBLEM AMAZON QUES

    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=4 && i<=target;i++){
            dice(p+i,target-i);
        }
    }


}
