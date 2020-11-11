package sk.itsovy.kovalcik.palindrom;

import java.util.Scanner;

public class Homework {
    /*
    1.
        Vytvorit aplikaciu s vyuzitim cyklu while ktora spocita vsetky trojciferne cisla,
        ktore maju navzajom rozdielne vsetky tri cifry:
        102+103+ ........ 986 + 987 = ?
     */

    public static void prvaUloha(){
        int cislo=100;
        int prve=0;
        int druhe=0;
        int tretie=0;
        int sucet=0;
        while (cislo<=999){
            prve=cislo/100;
            druhe=(cislo/10)%10;
            tretie=cislo%10;
            if (prve!=druhe && druhe!=tretie && tretie!=prve){
                sucet=sucet+cislo;
                System.out.print(cislo+" ");
                cislo++;
            }
            else {
                cislo++;
            }
        }
        System.out.println(sucet);
    }

    /*
    2. nepovinna uloha
    vytvorte algoritmus, ktory zisti, ci zadane cislo je palindrom.
    nevieme kolko cifier ma cislo - cislo moze byt rozne v intervale <0 ; 2 000 000 000>
     */
    public static void druhaUloha(){
        int copy=0;
        int copy2=0;
        int cifier=0;
        int pocet=0;
        int minus=1;
        int nieco=0;


        Scanner csl= new Scanner(System.in);
        System.out.println("Zadaj číslo ");
        int cislo= csl.nextInt();

        copy=cislo;
        copy2=cislo;
        while (cislo>0){
            cislo=cislo/10;
            cifier++;
        }
        int cifierCopy=cifier;


        for (int i = 0; i <(cifierCopy/2) ; i++) {
            nieco=(int) Math.pow(10,(cifier-minus));
            minus++;
            int vzorec1=copy/nieco;         // 3 1 5 6 4 6 6 1 3
            int vzorec2= copy2%10;
            if (vzorec1==vzorec2){
                copy2=copy2/10;
                copy=copy-((int) Math.pow(10,(cifier-minus+1))*vzorec1);
                pocet++;
            }
            else {
                break;
            }

        }
        if (cifier/2==pocet){
            System.out.println("číslo JE Palindrom!");
        }
        else {
            System.out.println("Čislo NIEJE Palindrom");
        }

    }

    /*
    3. nepovinna uloha
    spocitaj vsetky mocniny cisla 2 v intervale <1; 65 536>
    cize hladame sucet:
    1 + 2 + 4+ 8+ 16 + 32 + ... + 65536 = ?
     */

    public static void tretiaUloha(){
        int finalresult=0;
        int sucet=1;
        System.out.print(sucet+" ");
        while (sucet<=65536){
            sucet= sucet*2;
            finalresult=finalresult+sucet;
            if (sucet>65536){
                break;
            }
            System.out.print(sucet+" ");
        }
        System.out.println("= "+finalresult);
    }
    public static void main(String[] args) {
        druhaUloha();
    }
}
