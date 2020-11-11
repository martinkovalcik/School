package sk.itsovy.kovalcik.homework;

public class Dividing {
    public static void main(String[] args) {
        int a = 40;
        int b = 82;
        int dvd = 2; // dividing by 2
        do {
            if (a % dvd == 0 && b % dvd == 0) {
                a = a / dvd;
                b = b / dvd;
            }
            if (dvd >= 3)
                dvd += 2;
            else
                dvd++;
        } while (dvd <= a && dvd < b);
        System.out.println(a + " " + b);
    }
}
