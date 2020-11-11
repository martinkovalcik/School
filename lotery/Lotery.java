package sk.itsovy.kovalcik.lotery;

import java.util.Scanner;

/**
 *
 * -Lotéria-
 *
 * princip: zadáš 5 cisel, od 1-20 hodnoty, system random vypíše 10
 *
 *
 */

public class Lotery {

    private int[] bet = new int[5];
    private int[] draw = new int[10];
    private double howMuch;

    public static void main(String[] args) {
        Lotery lotery = new Lotery();


        lotery.inputNumbers();
        lotery.drawNumbers();
        lotery.finale();
        lotery.money();
    }

    public void inputNumbers(){
        int i = 0;
        int in;
        int h=0;
        double moneyy;
        Scanner sc = new Scanner(System.in);
        while(i<5){
            System.out.print("Type " + (i + 1) + ". number : ");
            in = sc.nextInt();
            if(in>0 && in < 21 && checkArray(i, in)) {
                bet[i]=in;
                i++;
            }
            else{
                System.out.println("Wrong NUMBER! Try again!");
            }
        }
        System.out.println("Your bet is: ");
        for(i = 0;i < 5;i++){
            System.out.print(bet[i] + " ");
        }

        System.out.println();
        System.out.println();
        while (h==0){
            System.out.println("Enter you bet for this competition");
            moneyy=sc.nextDouble();
            if (moneyy<=0){
                System.out.println(" You typed Negative sum !!!");
            }
            else {
                howMuch=moneyy;
                h++;
            }
        }
        System.out.println();
        System.out.println();
    }

    public boolean checkArray(int i, int in){
        if(i==0){
            return true;
        }
        for(int j = 0;j < i;j++){
            if(bet[j]==in){
                return false;
            }
        }
        return true;
    }

    public boolean checkArray2(int i, int draw){
        if(i==0){
            return true;
        }
        for(int j = 0;j < i;j++){
            if(this.draw[j]==draw){
                return false;
            }
        }
        return true;
    }

    public void drawNumbers(){
        int i = 0;
        int draw;
        while(i<10){
            draw = 1 + (int)(Math.random() * 20);
            if(checkArray2(i, draw)){
                this.draw[i] = draw;
                i++;
            }

        }
        System.out.println("Drawn numbers are: ");
        for(i = 0;i < 10;i++){
            System.out.print(this.draw[i] + " ");
        }
        System.out.println();
    }

    public void finale(){
        int p=0;
        for(int i = 0;i<10;i++){
            for(int j = 0;j < 5;j++){
                if(bet[j]== draw[i]){
                    p++;
                }
            }
        }
        System.out.println(p + " of your numbers matched with drawn numbers.");
        System.out.println();

    }

    public void money(){
        int o=0;
        for(int i = 0;i<10;i++){
            for(int j = 0;j < 5;j++){
                if(bet[j]== draw[i]){
                    o++;
                }
            }
        }

        switch (o){
            case 0:
                System.out.println("Vyhral si "+ howMuch*0 +" €");
                break;
            case 1:
                System.out.println("Vyhral si "+ howMuch*0 +" €");
                break;
            case 2:
                System.out.println("Vyhral si "+ howMuch*2 +" €");
                break;
            case 3:
                System.out.println("Vyhral si "+ howMuch*15 +" €");
                break;
            case 4:
                System.out.println("Vyhral si "+ howMuch*500 +" €");
                break;
            case 5:
                System.out.println("Vyhral si "+ howMuch*10000 +" €");
                break;
        }

    }



}
