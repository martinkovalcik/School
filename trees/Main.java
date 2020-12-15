package sk.itsovy.kovalcik.trees;

public class Main {
    public static void main(String[] args) {
        Linden s1= new Linden(18);
        Linden s2= new Linden(28);
        System.out.println( s1.equals(s2) );
        System.out.println( s1 == (s2) );
        System.out.println( s1.getAge() < s2.getAge() );
    }
}
