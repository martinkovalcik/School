package sk.itsovy.kovalcik.srandicky;

public class Srandickyy {
    public static void main(String[] args) {
        int i = 4;
        while(i<10) {
            System.out.println("A");
            i++;
            if(i%3 == 0)
                continue;
            if(i%2==1)
                System.out.println("B");
            else
                System.out.println("C");
            System.out.println("D");
        }

    }
}
