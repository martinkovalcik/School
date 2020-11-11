package sk.itsovy.kovalcik.domacaUloha;

import java.util.Scanner;

public class TicTacToe {


    public static void main(String[] args) {


        TicTacToe tct=new TicTacToe();
        tct.tictactoe();
    }

    public char [][] tictactoe(){
        Scanner A=new Scanner(System.in);
        Scanner B=new Scanner(System.in);

        char[][] array={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        int finish=0;
        int jeden=0,dva=0,tri=0,styri=0,pat=0,sest=0,sedem=0,
                osem=0,devet=0,jedenB=0,dvaB=0,triB=0,styriB=0,
                patB=0, sestB=0, sedemB=0,osemB=0,devetB=0,pocet=0;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[0].length ; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        while (finish==0){

            System.out.println("Hráč A na ťahu");
            int hracA=A.nextInt();
            while (hracA>9 || hracA<1){
                System.out.println("neplatne císlo, odznova zadaj ");
                hracA=A.nextInt();
            }
            switch (hracA){
                case 1:
                    if (array[0][0]!='O') {
                        array[0][0] = 'X';
                        pocet++;
                        jeden++;
                    }
                    else {
                        System.out.println("neplatne císlo, odznova zadaj ");
                        hracA=A.nextInt();
                        }
                    break;

                case 2:
                    if (array[0][1]!='O') {
                        array[0][1] = 'X';
                        pocet++;
                        dva++;
                    }
                    else {
                        System.out.println("neplatne císlo, odznova zadaj ");
                        hracA=A.nextInt();
                    }
                    break;
                case 3:
                    if (array[0][2]!='O') {
                        array[0][2] = 'X';
                        pocet++;
                        tri++;
                    }
                    else {
                        System.out.println("neplatne císlo, odznova zadaj ");
                        hracA=A.nextInt();
                    }
                    break;
                case 4:
                    if (array[1][0]!='O') {
                    array[1][0] = 'X';
                        pocet++;
                        styri++;
                }
                else {
                    System.out.println("neplatne císlo, odznova zadaj ");
                    hracA=A.nextInt();
                }
                    break;
                case 5: if (array[1][1]!='O') {
                    array[1][1] = 'X';
                    pocet++;
                    pat++;
                }
                else {
                    System.out.println("neplatne císlo, odznova zadaj ");
                    hracA=A.nextInt();
                }break;
                case 6: if (array[1][2]!='O') {
                    array[1][2] = 'X';
                    pocet++;
                    sest++;
                }
                else {
                    System.out.println("neplatne císlo, odznova zadaj ");
                    hracA=A.nextInt();
                }break;
                case 7: if (array[2][0]!='O') {
                    array[2][0] = 'X';
                    pocet++;
                    sedem++;
                }
                else {
                    System.out.println("neplatne císlo, odznova zadaj ");
                    hracA=A.nextInt();
                }break;
                case 8: if (array[2][1]!='O') {
                    array[2][1] = 'X';
                    pocet++;
                    osem++;
                }
                else {
                    System.out.println("neplatne císlo, odznova zadaj ");
                    hracA=A.nextInt();
                }break;
                case 9: if (array[2][2]!='O') {
                    array[2][2] = 'X';
                    pocet++;
                    devet++;
                }
                else {
                    System.out.println("neplatne císlo, odznova zadaj ");
                    hracA=A.nextInt();
                }break;
            }

            if (jeden==1 && dva==1 && tri==1){
                System.out.println("HRÁČ A VYHRAL!");
                finish++;
                break;
            }
            else if (styri==1 && pat==1 && sest==1){
                System.out.println("HRÁČ A VYHRAL!");
                finish++;
                break;
            }
            else if (sedem==1 && osem==1 && devet==1){
                System.out.println("HRÁČ A VYHRAL!");
                finish++;
                break;
            }
            else if (jeden==1 && styri==1 && sedem==1){
                System.out.println("HRÁČ A VYHRAL!");
                finish++;
                break;
            }
            else if (dva==1 && pat==1 && osem==1){
                System.out.println("HRÁČ A VYHRAL!");
                finish++;
                break;
            }
            else if (tri==1 && sest==1 && devet==1){
                System.out.println("HRÁČ A VYHRAL!");
                finish++;
                break;
            }
            else if (jeden==1 && pat==1 && devet==1){
                System.out.println("HRÁČ A VYHRAL!");
                finish++;
                break;
            }
            else if (tri==1 && pat==1 && sedem==1){
                System.out.println("HRÁČ A VYHRAL!");
                finish++;
                break;
            }
            else if (pocet==9){
                System.out.println("Remiza!");
                break;
            }



            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j <array[0].length ; j++) {
                    System.out.print(array[i][j]+" ");
                }
                System.out.println();
            }

            System.out.println("Hráč B na ťahu");
            int hracB=B.nextInt();
            while (hracB>9 || hracB<1){
                System.out.println("neplatne císlo, odznova zadaj ");
                hracB=B.nextInt();
            }

            switch (hracB){
                case 1:
                    if (array[0][0]!='X') {
                        array[0][0] = 'O';
                        pocet++;
                        jedenB++;
                    }
                    else {
                        System.out.println("neplatne císlo, odznova zadaj ");
                        hracA=A.nextInt();
                    }
                    break;

                case 2:
                    if (array[0][1]!='X') {
                        array[0][1] = 'O';
                        pocet++;
                        dvaB++;
                    }
                    else {
                        System.out.println("neplatne císlo, odznova zadaj ");
                        hracA=A.nextInt();
                    }
                    break;
                case 3:
                    if (array[0][2]!='X') {
                        array[0][2] = 'O';
                        pocet++;
                        triB++;
                    }
                    else {
                        System.out.println("neplatne císlo, odznova zadaj ");
                        hracA=A.nextInt();
                    }
                    break;
                case 4:
                    if (array[1][0]!='X') {
                        array[1][0] = 'O';
                        pocet++;
                        styriB++;
                    }
                    else {
                        System.out.println("neplatne císlo, odznova zadaj ");
                        hracA=A.nextInt();
                    }
                    break;
                case 5: if (array[1][1]!='X') {
                    array[1][1] = 'O';
                    pocet++;
                    patB++;

                }
                else {
                    System.out.println("neplatne císlo, odznova zadaj ");
                    hracA=A.nextInt();
                }break;
                case 6: if (array[1][2]!='X') {
                    array[1][2] = 'O';
                    pocet++;
                    sestB++;
                }
                else {
                    System.out.println("neplatne císlo, odznova zadaj ");
                    hracA=A.nextInt();
                }break;
                case 7: if (array[2][0]!='X') {
                    array[2][0] = 'O';
                    pocet++;
                    sedemB++;
                }
                else {
                    System.out.println("neplatne císlo, odznova zadaj ");
                    hracA=A.nextInt();
                }break;
                case 8: if (array[2][1]!='X') {
                    array[2][1] = 'O';
                    pocet++;
                    osemB++;
                }
                else {
                    System.out.println("neplatne císlo, odznova zadaj ");
                    hracA=A.nextInt();
                }break;
                case 9: if (array[2][2]!='X') {
                    array[2][2] = 'O';
                    pocet++;
                    devetB++;
                }
                else {
                    System.out.println("neplatne císlo, odznova zadaj ");
                    hracA=A.nextInt();
                }break;
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j <array[0].length ; j++) {
                    System.out.print(array[i][j]+" ");
                }
                System.out.println();
            }

            if (jedenB==1 && dvaB==1 && triB==1){
                System.out.println("HRÁČ B VYHRAL!");
                finish++;
                break;
            }
            else if (styriB==1 && patB==1 && sestB==1){
                System.out.println("HRÁČ B VYHRAL!");
                finish++;
                break;
            }
            else if (sedemB==1 && osemB==1 && devetB==1){
                System.out.println("HRÁČ B VYHRAL!");
                finish++;
                break;
            }
            else if (jedenB==1 && styriB==1 && sedemB==1){
                System.out.println("HRÁČ B VYHRAL!");
                finish++;
                break;
            }
            else if (dvaB==1 && patB==1 && osemB==1){
                System.out.println("HRÁČ B VYHRAL!");
                finish++;
                break;
            }
            else if (triB==1 && sestB==1 && devetB==1){
                System.out.println("HRÁČ B VYHRAL!");
                finish++;
                break;
            }
            else if (jedenB==1 && patB==1 && devetB==1){
                System.out.println("HRÁČ B VYHRAL!");
                finish++;
                break;
            }
            else if (triB==1 && patB==1 && sedemB==1){
                System.out.println("HRÁČ B VYHRAL!");
                finish++;
                break;
            }
            else if (pocet==9){
                System.out.println("Remiza!");
                break;
            }


        }
        if (finish==1){
            System.out.println("Koniec hry!");
        }



        return array;
    }
}
