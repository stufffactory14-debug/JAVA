import java.util.Random;
import java.util.Scanner;

public class rockpaperseser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        System.out.println("enter number to play /n 1= rock 2= paper 3=seaser");
        int a = sc.nextInt();
        int b = ra.nextInt(1, 4);

        if(a==1 && b==1){
            System.out.println("draw");
        }
        else if(a==2 && b==2){
            System.out.println("draw");
        }
        else if(a==3 && b==3){
            System.out.println("draw");
        }
        else if(a==1 && b==2){
            System.out.println("you are lost");
        }
        else if(a==1 && b==3){
            System.out.println("you won");
        }
        else if(a==2 && b==1){
            System.out.println("you wom");
        }
        else if(a==2 && b==3){
            System.out.println("you lost");
        }
        else if(a==3 && b==1){
            System.out.println("you lost");
        }
        else if(a==3 && b==2){
            System.out.println("you won");
        }
        System.out.println("my number was  "+b);
    }

    }
