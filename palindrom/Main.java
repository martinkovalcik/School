package sk.itsovy.kovalcik.palindrom;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void spotreba(){
        System.out.println("Ahoj uzivatel");
        Scanner cena = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Zadaj cenu benzinu na Liter:");
        double price = cena.nextDouble();
        Scanner vzdiadelnost = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Zadaj vzdialenost:");
        int distance = vzdiadelnost.nextInt();
        Scanner spotreba = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Zadaj Spotrebu auta:");
        double consumption = spotreba.nextDouble();
        double cash = (consumption / 100) * distance * price;
        System.out.println("zaplatis = " + cash + "€");
    }

    public static void carsArraylist(){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("Mercedes");
        cars.add("Volkswagen");
        System.out.println(cars);
    }

    public static void carsArray(){
        String[] cars = new String[3];
        cars[0]="Honda";
        cars[2]="Tesla";
        cars[1]="Mercedes";


        for (int i = 0; i < cars.length; i++) {
            cars[i]="Auto "+cars[i];
        }

        for (String s:cars) {
            System.out.println(s);
        }
    }

    public static void splatky(){

        double price = 750;
        double interest = 8.9;
        int years = 3;

        double yearsfinal=years*12;
        double fairs= price/100*interest;
        double sum= fairs+price;


        double monthlypay= sum/yearsfinal;
        System.out.println(monthlypay);

    }


    public static void automaticSplatky(){
        System.out.println("Hello user");
        Scanner cena = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Type price");
        double price = cena.nextDouble();
        Scanner interest = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Type interest:");
        double splatky = interest.nextDouble();
        Scanner years = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Type years:");
        double roky = years.nextDouble();
        double fairs= price/100*splatky;
        double sum= fairs+price;
        System.out.println("You will pay = " + sum/(roky*12) + "€");
    }


    public static void cisla(){
        double c=9657.8;
        double c1=(c%10);
        DecimalFormat df = new DecimalFormat("###");
        System.out.println(df.format(c1));

    }


    public static void main(String[] args) {



    }
}
