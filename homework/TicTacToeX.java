package sk.itsovy.kovalcik.homework;

import java.util.Scanner;

public class TicTacToeX {
    private int player=1;
    private int [][]arrayPool;
    private int count=0;

    public TicTacToeX(){
        arrayPool= new int[5][5];
        sizeOfArray();
    }
    private void sizeOfArray(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arrayPool[i][j]=0;
            }
        }
    }
    private void printGame(){
        System.out.println("- - - - -");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(arrayPool[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("- - - - -");
    }
    private void anotherPlayer(){
        if (player==1){
            player=2;
        }
        else if (player==2){
            player=3;
        }
        else {
            player=1;
        }
    }

    public int matchUp(){
        int a;
        for (a = 0; a < 5; a++) {
            if (arrayPool[a][0]*arrayPool[a][1]*arrayPool[a][2]*arrayPool[a][3]*arrayPool[a][4]==1 || arrayPool[0][a]*arrayPool[1][a]*arrayPool[2][a]*arrayPool[3][a]*arrayPool[4][a]==1)
                return 1;
            if(arrayPool[a][0]*arrayPool[a][1]*arrayPool[a][2]*arrayPool[a][3]*arrayPool[a][4]==32 || arrayPool[0][a]*arrayPool[1][a]*arrayPool[2][a]*arrayPool[3][a]*arrayPool[4][a]==32)
                return 2;
            if(arrayPool[a][0]*arrayPool[a][1]*arrayPool[a][2]*arrayPool[a][3]*arrayPool[a][4]==243 || arrayPool[0][a]*arrayPool[1][a]*arrayPool[2][a]*arrayPool[3][a]*arrayPool[4][a]==243)
                return 3;
        }
        if(arrayPool[0][0]*arrayPool[1][1]*arrayPool[2][2]*arrayPool[3][3]*arrayPool[4][4]==1 || arrayPool[0][4]*arrayPool[1][3]*arrayPool[2][2]*arrayPool[3][1]*arrayPool[4][0]==1)
            return 1;
        if(arrayPool[0][0]*arrayPool[1][1]*arrayPool[2][2]*arrayPool[3][3]*arrayPool[4][4]==32 || arrayPool[0][4]*arrayPool[1][3]*arrayPool[2][2]*arrayPool[3][1]*arrayPool[4][0]==32)
            return 2;
        if(arrayPool[0][0]*arrayPool[1][1]*arrayPool[2][2]*arrayPool[3][3]*arrayPool[4][4]==243 || arrayPool[0][4]*arrayPool[1][3]*arrayPool[2][2]*arrayPool[3][1]*arrayPool[4][0]==243)
            return 3;
        return 0;
    }
    public void play(){
        int input=0;
        Scanner sc=new Scanner(System.in);
        while (matchUp()==0){
            System.out.println();
            System.out.println("Player "+player+" type number...");
            input=sc.nextInt();
            if(input<1 || input>25) {
                System.out.println("Input number between 1-25");
                continue;
            }
            int r=(input-1)/5;
            int c=(input-1)%5;
            if(arrayPool[r][c]!=0) {
                System.out.println("This array is taken, choose another one");
                continue;
            }
            arrayPool[r][c]=player;
            printGame();
            count++;
            if(count==25){
                break;
            }
            anotherPlayer();
        }

        if(matchUp()==1){
            System.out.println("Player 1 is a winner!!");
        }
        else if(matchUp()==2){
            System.out.println("Player 2 is a winner!!");
        }
        else if (matchUp()==3){
            System.out.println("Player 3 is a winner!!");
        }
        else{
            System.out.println("DRAW!");
        }
    }

    public static void main(String[] args) {
        TicTacToeX game = new TicTacToeX();
        System.out.println();
        System.out.println();
        System.out.println("-WELCOME-");
        game.printGame();
        game.play();
    }

}
