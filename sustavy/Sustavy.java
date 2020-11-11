package sk.itsovy.kovalcik.sustavy;


import java.util.Scanner;

/**
 * By: Martin Kovalčík
 * Subject: Prevod z Desiatkovej sústavy do Dvojkovej/Osmickovej/Šestnastkovej sústavy
 */

public class Sustavy {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int y = 0;
        int reverse=0;
        int cislo=0;
        int zaciatok=0;
        int dvojkova=0;
        int c=0;
        int mocnina=0;
        int pocet=0;


        Scanner ns=new Scanner(System.in);
        System.out.println("Zadaj v akej hodnote budeš zapisovať číslo (2,8,10,16)");
        int porovnanie=ns.nextInt();


        Scanner ds=new Scanner(System.in);
        System.out.println("Napiš hodnotu čisla");
        int zadanaHodnota=ds.nextInt();


        Scanner ht=new Scanner(System.in);
        System.out.println("Napíš Hodnotu v akej to chceš mať (2,8,10,16)");
        int hodnota=ht.nextInt();

        int x = zadanaHodnota;




        if (hodnota==10 && porovnanie==2){

            int copy=zadanaHodnota;
            while (zadanaHodnota!=0){
                zadanaHodnota=zadanaHodnota/10;
                pocet++;
            }
            for (int i = pocet; i >= 0; i--) {
                a=copy%10;
                b=a*((int)Math.pow(2,mocnina));
                c=c+b;
                mocnina++;
                copy/=10;
            }
            System.out.println(c);

        }






        else if (hodnota==2 && porovnanie==10){


        while (zadanaHodnota!=0){
            if (zadanaHodnota%2==0 && b==0){
                zaciatok++;
            }
            if (zadanaHodnota%2==1){
                b++;
                a=a+1;
                dvojkova=dvojkova+1;
                if (zadanaHodnota!=1){
                    dvojkova=dvojkova*10;
                }
                zadanaHodnota=zadanaHodnota/2;
            }
            else {
                dvojkova=dvojkova*10;
                zadanaHodnota=zadanaHodnota/2;
            }
        }
        while (dvojkova!=0){
            cislo=dvojkova%10;
            reverse=reverse*10+cislo;
            dvojkova/=10;
        }

        if (zaciatok>=1){
            System.out.print(reverse);
            for (int i = 1; i <=zaciatok ; i++) {
                System.out.print("0");
            }
        }
        else {
            System.out.println(reverse);
        }

        }

        else if(hodnota==8 && porovnanie==10){
            while(x%8==0){
                y = y + 1;
                x = x / 8;
            }
            int p = 1;
            while(x>0){
                a = (int) (a + ((x%8)*Math.pow(10, p)));
                p++;
                if(x%8!=0){
                    x=(x-1)/8;
                }
                else{
                    x=x/8;
                }
            }
            a = a / 10;

            if(y>0){
                for(int i = 0;i<y;i++){
                    a = a * 10;
                }
            }
            System.out.println("vysledok v 8-ovej sústave: " + a);
        }



        else if(hodnota==16 && porovnanie==10){
            String p = "";

            while(x>0){
                int z = x%16;


                p = switch (z) {
                    case 10 -> "A" + p;
                    case 11 -> "B" + p;
                    case 12 -> "C" + p;
                    case 13 -> "D" + p;
                    case 14 -> "E" + p;
                    case 15 -> "F" + p;
                    default -> z + p;
                };
                x=x/16;

            }
            System.out.println("Vysledok v 16-ovej sústave: " + p);
        }



    }
}