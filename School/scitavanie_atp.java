package sk.itsovy.kovalcik.school;

import java.util.Scanner;

public class Scitavanie_atp {
    public static void main(String[] args) {
        int hodnota=0;
        int a=0;
        while (a!=16){
            Scanner h=new Scanner(System.in);
            System.out.println("Zadaj číslo");
            hodnota=h.nextInt();
            a=hodnota+(a);
            System.out.println(a);
        }
    }
}
