import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        char [][] board = {{'_','_','_'},{'_','_','_'},{'_','_','_'}};
        boolean over = false;
        while(over==false){
            System.out.println("lets start the tic tac toe game");
            player(board);
            over = gameResult(board);
            if(over==true){
                break;
            }
            computerRandom(board);
            over=gameResult(board);
            if(over==true){
                break;
            }
        }




    }

    public static void print(char [][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println("---------------------");

    }


    public static void player(char[][] board){
        Scanner s = new Scanner(System.in);
        char c = 'x';
        try {
            System.out.println("please enter your move (1-9)");
            int move = s.nextInt();

            boolean valid = validCheck(move, board);
            while (valid == false) {
                System.out.println("invalid move try again");
                move = s.nextInt();
                valid = validCheck(move, board);
            }
            if (move == 1) {
                board[0][0] = c;
                print(board);
            } else if (move == 2) {
                board[0][1] = c;
                print(board);
            } else if (move == 3) {
                board[0][2] = c;
                print(board);
            } else if (move == 4) {
                board[1][0] = c;
                print(board);
            } else if (move == 5) {
                board[1][1] = c;
                print(board);
            } else if (move == 6) {
                board[1][2] = c;
                print(board);
            } else if (move == 7) {
                board[2][0] = c;
                print(board);
            } else if (move == 8) {
                board[2][1] = c;
                print(board);
            } else if (move == 9) {
                board[2][2] = c;
                print(board);
            }
        }catch (InputMismatchException e){
            System.out.println("use the right format ");
            player(board);

        }

    }

    public static void computerRandom(char[][] board){
        char c ='o';
        Random r = new Random();
        int move = r.nextInt(9)+1;

        boolean valid = validCheck(move,board);
        while(valid==false){
            move = r.nextInt(9)+1;
            valid = validCheck(move,board);
        }
        if(move ==1){
            board[0][0]=c;
            print(board);
        }else if (move ==2){
            board[0][1]=c;
            print(board);
        }else if (move ==3){
            board[0][2]=c;
            print(board);
        }else if (move ==4){
            board[1][0]=c;
            print(board);
        }else if (move ==5){
            board[1][1]=c;
            print(board);
        }else if (move ==6){
            board[1][2]=c;
            print(board);
        }else if (move ==7){
            board[2][0]=c;
            print(board);
        }else if (move ==8){
            board[2][1]=c;
            print(board);
        }else if (move ==9){
            board[2][2]=c;
            print(board);
        }



    }

    public static boolean validCheck(int move,char[][] board ){
        switch (move){
            case 1:
                if(board[0][0] =='_'){
                    return true;
                }else return false;
            case 2:
                if(board[0][1] =='_'){
                    return true;
                }else {
                    return false;
                }
            case 3:
                if(board[0][2] =='_'){
                    return true;
                }else{
                    return false;
                }
            case 4:
                if(board[1][0] =='_'){
                    return true;
                }else {
                    return false;
                }
            case 5:
                if(board[1][1] =='_'){
                    return true;
                }else{
                    return false;
                }
            case 6:
                if(board[1][2] =='_'){
                    return true;
                }else {
                    return false;
                }
            case 7:
                if(board[2][0] =='_'){
                    return true;
                }else{
                    return false;
                }
            case 8:
                if(board[2][1] =='_'){
                    return true;
                }else {
                    return false;
                }
            case 9:
                if(board[2][2] =='_'){
                    return true;
                }else {
                    return false;
                }

            default:
                return false;
        }

    }
    public static boolean gameResult(char[][] board){
        if(board[0][0]=='x' && board[0][1]=='x'&&board[0][2]=='x'){
            System.out.println("You win");
            return true;
        }
        if(board[0][0]=='o' && board[0][1]=='o'&&board[0][2]=='o'){
            System.out.println("You loos");
            return true;
        }
        if(board[1][0]=='x' && board[1][1]=='x'&&board[1][2]=='x'){
            System.out.println("You win");
            return true;
        }
        if(board[1][0]=='o' && board[1][1]=='o'&&board[1][2]=='o'){
            System.out.println("You loos");
            return true;
        }
        if(board[2][0]=='x' && board[2][1]=='x'&&board[2][2]=='x'){
            System.out.println("You win");
            return true;
        }
        if(board[2][0]=='o' && board[2][1]=='o'&&board[2][2]=='o'){
            System.out.println("You loos");
            return true;
        }
        if(board[0][0]=='x' && board[1][0]=='x'&&board[2][0]=='x'){
            System.out.println("You win");
            return true;
        }
        if(board[0][0]=='o' && board[1][0]=='o'&&board[2][0]=='o'){
            System.out.println("You loos");
            return true;
        }
        if(board[0][1]=='x' && board[1][1]=='x'&&board[2][1]=='x'){
            System.out.println("You win");
            return true;
        }
        if(board[0][1]=='o' && board[1][1]=='o'&&board[2][1]=='o'){
            System.out.println("You loos");
            return true;
        }
        if(board[0][2]=='x' && board[1][2]=='x'&&board[2][2]=='x'){
            System.out.println("You win");
            return true;
        }
        if(board[0][2]=='o' && board[1][2]=='o'&&board[2][2]=='o'){
            System.out.println("You loos");
            return true;
        }
        if(board[0][0]=='x' && board[1][1]=='x'&&board[2][2]=='x'){
            System.out.println("You win");
            return true;
        }
        if(board[0][0]=='o' && board[1][1]=='o'&&board[2][2]=='o'){
            System.out.println("You loos");
            return true;
        }
        if(board[0][2]=='x' && board[1][1]=='x'&&board[2][0]=='x'){
            System.out.println("You win");
            return true;
        }
        if(board[0][2]=='0' && board[1][1]=='0'&&board[2][0]=='0'){
            System.out.println("You loos");
            return true;
        }
        if(board[0][0]!='_' && board[0][1]!='_' && board[0][2]!='_' && board[1][0]!='_' && board[1][1]!='_' &&
                board[1][2]!='_' &&board[2][0]!='_' &&board[2][1]!='_' &&board[2][2]!='_' ){
            System.out.println("tie!");
            return true;
        }

        return false;

    }


}