package ticktacto_game;
import java.util.Scanner;
public class game {
    public static void main(String[] args) {
        char[][] arr = new char[3][3];
        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=' ';
            }
        }
        boolean gameover = false;
        char player = 'X';
        while(!gameover){
            printBoard(arr);
            if(draw(arr)){
                System.out.println("It's a draw !!");
                break;
            }
            System.out.println("YOUR TURN " + player);
            int row = sc.nextInt();
            int col= sc.nextInt();

            if(arr[row][col]==' ') {
                arr[row][col] = player;
            }else {
                System.out.println("Cell already occupied! Try again.");
                continue;
            }

            gameover = matchend(arr);
            if(gameover){
                System.out.println(player + " HAS WON THE MATCH !");
            }else{
                player = (player=='X')?'O':'X';
            }



        }
    }

    private static boolean draw(char[][] arr) {
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==' '){
                    return false;
                }
            }
        }
        return true;
    }


    private static boolean matchend(char[][] arr) {
        //checking for row
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]=='X' && arr[i][1]=='X' && arr[i][2]=='X' || arr[i][0]=='O' && arr[i][1]=='O' && arr[i][2]=='O' ){
                return true;
            }
        }

        //for col
        for (int i=0;i<arr[0].length;i++){
            if(arr[0][i]=='X' && arr[1][i]=='X' && arr[2][i]=='X' || arr[0][i]=='O' && arr[1][i]=='O' && arr[2][i]=='O' ){
                return true;
            }
        }

        //digonal
        if(arr[0][0]=='X' && arr[1][1]=='X' &&arr[2][2]=='X' || arr[0][2]=='X' && arr[1][1]=='X' && arr[2][0]=='X' || arr[0][0]=='O' && arr[1][1]=='O' && arr[2][2]=='O' || arr[0][2]=='O' && arr[1][1]=='O' && arr[2][0]=='O'  ){
            return true;
        }
        return false;
    }

    private static void printBoard(char[][] arr) {
        System.out.println("-------------");
        for (int row = 0; row < arr.length; row++) {
            System.out.print("| ");
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}
