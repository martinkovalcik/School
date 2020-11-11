package sk.itsovy.kovalcik.homework;

public class Odrazenie {
    public int pocetOdrazov(double height,double koeficientodrazu){
        int count=0;
        while (height>=100){
            count++;
            height=height*koeficientodrazu;
        }
        return count;
    }

    public static void main(String[] args) {
        Odrazenie odrazenie=new Odrazenie();
        System.out.println(odrazenie.pocetOdrazov(200,0.9));
    }
}
