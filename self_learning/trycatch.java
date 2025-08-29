import java.util.Scanner;


//public class trycatch {
//    public static void main(String[] args) {
//        int lakhan[]= {54,62,8,2};
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter array index");
//        int a1= sc.nextInt();
//        System.out.println("enter numberr to divide");
//        int number= sc.nextInt();
//        try {
//            System.out.println("idex number is " + lakhan[a1]);
//            System.out.println("output " + lakhan[a1] / number);
//        }
//        catch(ArithmeticException e){
//            System.out.println("fail to run reason :");
//            System.out.println(e);
//        }
//    }
//}
class customerror extends Exception{
    public String toString(){
        return "error";
    }
    public String getMessage(){
        return "error";
    }
}

public class trycatch {
    public static void main(String[] args) {
        int lakhan1[] = {50, 67, 35, 786, 3};
        boolean flag = true;
        int index;
        int i = 0;

        while (flag && i < 5) {
            try {
                System.out.println("enter index number to check array is available: ");
                Scanner sc = new Scanner(System.in);
                index = sc.nextInt();
                System.out.println(lakhan1[index]);
                break;
            } catch (Exception e) {
                System.out.println("invalid index of array");
                i++;
            }
        }
        if (i>=5) {
            try {
                throw new customerror();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}