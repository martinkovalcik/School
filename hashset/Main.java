package sk.itsovy.kovalcik.hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {

        Set<String> mnozina=new HashSet<>() ;
            mnozina.add("Peter");
            mnozina.add("Martina");

            mnozina.add("Kristian");
            mnozina.add("Helena");
            mnozina.add("Lukas");
            mnozina.add("Lenka");
            mnozina.add("Michal");
            mnozina.add("Martin");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Homework *a*");
        System.out.println("count  "+mnozina.size());

    }
}
