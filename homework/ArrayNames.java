package sk.itsovy.kovalcik.homework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class ArrayNames {
    public static void main(String[] args) {
        int maxLength=0;
        String longestString = null;

        Set<String> mnozina=new HashSet<>() ;
        mnozina.add("Peter");
        mnozina.add("Martina");
        mnozina.add("David");
        mnozina.add("Daniela");
        mnozina.add("Ivan");
        mnozina.add("Sebastian");
        mnozina.add("Roman");
        mnozina.add("Peter");
        mnozina.add("Svetlana");
        mnozina.add("Martin");
        mnozina.add("Denis");
        mnozina.add("Viliam");
        mnozina.add("Daniel");
        mnozina.add("Tomas");
        mnozina.add("Frantisek");
        mnozina.add("Dominik");
        mnozina.add("Samuel");
        mnozina.add("Sebastian");
        mnozina.add("Rebeka");
        mnozina.add("Rebeka");
        mnozina.add("Rebeka");
        mnozina.add("Slavomir");
        mnozina.add("Richard");
        mnozina.add("Daniela");
        mnozina.add("Eva");
        mnozina.add("Simona");
        mnozina.add("Lenka");
        mnozina.add("Robert");
        mnozina.add("Milan");
        mnozina.add("Peter");
        mnozina.add("Erik");
        mnozina.add("David");
        mnozina.add("Samuel");
        mnozina.add("Eva");
        mnozina.add("Ema");
        mnozina.add("Tomas");
        mnozina.add("Erika");
        mnozina.add("Damian");
        mnozina.add("Dominik");
        mnozina.add("Leo");
        mnozina.add("Filip");
        mnozina.add("Radomir");
        mnozina.add("Andrea");
        mnozina.add("Barbora");
        mnozina.add("Kristina");
        mnozina.add("Marek");
        mnozina.add("Richard");
        mnozina.add("Peter");
        mnozina.add("Petra");
        mnozina.add("Pavol");
        mnozina.add("Pavlina");
        mnozina.add("Jan");
        mnozina.add("Daniela");
        mnozina.add("Peter");
        mnozina.add("Filip");
        mnozina.add("Frantisek");
        mnozina.add("Koloman");
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
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Homework *b*");
        System.out.println("All names:");
        System.out.println("----");
        for (String allNames:mnozina)
            System.out.println(allNames);

        System.out.println("\n");
        System.out.println("\n");

        TreeSet abeceda=new TreeSet();
        abeceda.addAll(mnozina);
        System.out.println("Homework *c*");
        System.out.println("Order by alphabet:");
        System.out.println("----");
        for (Object Alpha:abeceda){
            System.out.println(Alpha);
        }
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Homework *d*");
        System.out.println("Longest name:");
        System.out.println("----");

        for (String s : mnozina) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        System.out.println(longestString);

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Homework *e*");
        System.out.println("Most repeatedly name:");
        System.out.println("----");
        System.out.println("zatial mi to nenapadlo , sadly ");
        for (String count : mnozina) {
            for (String counted : mnozina) {

            }
        }


    }
}

