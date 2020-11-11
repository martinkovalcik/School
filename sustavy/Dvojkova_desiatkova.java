package sk.itsovy.kovalcik.sustavy;

import java.util.Scanner;

public class Dvojkova_desiatkova {
    public static void main(String[] args) {
        String a = "";
        String lastFourDigits="";
        int b=0;
        int c=0;

        Scanner ns=new Scanner(System.in);
        System.out.println("Zadaj císlo v dvojkovej");
        String cislo=ns.nextLine();
        String copy=cislo;


       while (copy!="0"){


            if (copy.length() > 4){
                lastFourDigits = copy.substring(copy.length() - 4);
            }
            else{
                lastFourDigits = copy;
            }

            if (lastFourDigits.length()<=4){
                switch (lastFourDigits){
                    case "1111": a="F";break;
                    case "1110": a="E";break;
                    case "1101": a="D";break;
                    case "1100": a="C";break;
                    case "1011": a="B";break;
                    case "1010": a="A";break;
                    case "1001": a="9";break;
                    case "1000": a="8";break;
                    case "0111": a="7";break;
                    case "111": a="7";break;
                    case "0110": a="6";break;
                    case "110": a="6";break;
                    case "0101": a="5";break;
                    case "101": a="5";break;
                    case "0100": a="4";break;
                    case "100": a="4";break;
                    case "0011": a="3";break;
                    case "11": a="3";break;
                    case "0010": a="2";break;
                    case "10": a="2";break;
                    case "0001": a="1";break;
                    case "1": a="1";break;
                    default: a="0";


                }
            }

         copy=(copy.substring(0, copy.length() - 4));
        }
        System.out.println(a);

    }
}
