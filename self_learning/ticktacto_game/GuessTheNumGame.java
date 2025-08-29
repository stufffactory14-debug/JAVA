import java.util.Scanner;
import java.util.Random;
class

game{
    int a;
    int b;
    int c;

    // GUESS THE NUMBER GAME

public int game(){
    Random ra= new Random();
    a=ra.nextInt(0,101);
    return a;
    }
public void user() {
    while (a != b) {
        Scanner lakhan = new Scanner(System.in);
        System.out.println("enter number to guess");
        b = lakhan.nextInt();
        c++;
        if(a>b){
            System.out.println("take a big number");
        }
        else if (a<b){
            System.out.println("take a smal00l number");

        }
    }

}
public void correct(){
        System.out.println("correct guess");
    }
    public void how(){
        System.out.println("number of guesses : "+c);
    if(c==1 || c==2){
        System.out.println("you are an champion(tukka lg gya tera bsdk)");
    }
    else if(c<=5){
        System.out.println("you are an pro player");
    }
    else if(c<100){
        System.out.println("bsdk khelna sikh kar aoo");
    }
    }
}
public class GuessTheNumGame {
    public static void main(String[] args) {
        game bhavya= new game();
        bhavya.game();
        bhavya.user();
        bhavya.correct();
        bhavya.how();
    }
}
