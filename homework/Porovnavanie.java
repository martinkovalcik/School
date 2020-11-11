package sk.itsovy.kovalcik.homework;

import java.util.Scanner;

public class Porovnavanie {
    int pocet=0;
    String hex="0123456789ABCDEF";
    public boolean isHexadecimalNumber(String value){
        for (int i = 0; i < value.length(); i++) {
            char result=value.charAt(i);
            for (int j = 0; j <=hex.length(); j++) {
            char result2=hex.charAt(j);
            if (result==result2){
                pocet++;
            }
            }
        }

        if (pocet==value.length())
            return true;
        else
            return false;

        // "1254" true
        // "E8" true
        // "T15" false
        // "ae4d" true
        // "14d!" false

    }

    public boolean isBinaryNumber(String value){


        return true;
    }

    public boolean isOctalNumber(String value){


        return true;
    }


    static void isHexadecimalNumber() {

    }


    public static void main(String[] args) {
        int pocet=0;
        String hex="0123456789ABCDEF";
        Scanner sc=new Scanner(System.in);
        String value=sc.nextLine();
        for (int i = 0; i < value.length(); i++) {
            char result=value.charAt(i);
            for (int j = 0; j <hex.length(); j++) {
                char result2=hex.charAt(j);
                if (result==result2){
                    pocet++;
                }
            }
        }

        if (pocet==value.length())
            System.out.println("pravda");
        else
            System.out.println("nepravda");
    }
}

