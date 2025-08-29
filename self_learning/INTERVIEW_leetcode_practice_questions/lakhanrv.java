import java.util.Scanner;
import java.util.Random;
public class lakhanrv {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number");
//        String a= sc.nextLine();
//
//        System.out.println(a);
//        String letter = "dh bhahw  ";
//       System.out.println(letter.indexOf(" "));
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your age :\n ");
//        int age = sc.nextInt();
//
//         use of is else statement
//
//        if (age>=18){
//            System.out.println("you are an adult");
//        }
//        else if (age==17) {
//            System.out.println("you are in mid ");
//        }
//
//        else{
//            System.out.println("you are a child");
//        }
//
//        single quote is use for char onyl
//      char lakhan= 'a';
//        System.out.println(lakhan);
//
//         use of switch
//        switch (age){
//            case 18:
//            System.out.println("your are adult");
//            break;
//            case 17:
//                System.out.println("you are going to be an adult in a year");
//                break;
//            default:
//                System.out.println("kya dekh rah h be");

 //       }

        // practice 1
//        float bhavya=3f;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your 1st exam marks");
//        int a = sc.nextInt();
//
//        if (a>=33){
//            System.out.println("you are pass in english");
//        }
//        else{
//            System.out.println("you are fail in english");
//        }
//        System.out.println("enter your maths marks" );
//
//        int b= sc.nextInt();
//        if (b>=33){
//            System.out.println("you are pass in maths");
//        }
//        else {
//            System.out.println("you are fail in maths");
//        }
//
//        System.out.println("enter your chemistry marks");
//        int c= sc.nextInt();
//        if (c>=33){
//            System.out.println("you are pass in english");
//        }
//        else{
//            System.out.println("you are fail");
//        }
//
//        System.out.println(" your  final percentage");
//        float lakhan= a+b+c;
//        float lk= lakhan/bhavya;
//        System.out.println(lk);
//        if (lk>=40){
//            System.out.println("you are promoted to next class");
//        }
//        else {
//            System.out.println("g ive are exam you are fail");
//        }

//        practice 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("search days");
//        int a = sc.nextInt();
//        if (a==1){
//            System.out.println("day is monday");
//        }
//        else if(a==2) {
//            System.out.println("day is tueday");
//        }
//        else if (a==3) {
//            System.out.println("day is wednesday");
//        }
//        else if (a==4){
//            System.out.println("day is thursday");
//        }

        Scanner sc= new Scanner(System.in);
        Random ra= new Random();
        System.out.println("enter number to play /n 1= rock 2= paper 3=seaser");
        int a= sc.nextInt();
        int b= ra.nextInt(1,4);
        if (a==1 && b==1)        {
            System.out.println("draw");
        }
        else if (a==2 && b==2) {
            System.out.println("draw");
        }
        else if (a==3 && b==3) {
            System.out.println("draw");
        }
        else if (a==1 && b==2) {
            System.out.println("you are lost");
        }
        else if (a==1 && b==3){
            System.out.println("you won");
        }
        else if (a==2 && b==1) {
            System.out.println("you wom");
        }
        else if (a==2 && b==3) {
            System.out.println("you lost");
        }
        else if (a==3 && b==1) {
            System.out.println("you lost");
        }
        else if (a==3 && b==2) {
            System.out.println("you won");
        }
        System.out.println("my number was  " + b);
    }
}

