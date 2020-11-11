package sk.itsovy.kovalcik.pisomky;

public class JavaStvrtytest {
    public static void main(String[] args) {
        int x=3;
        do{
            System.out.println("*");
            x=x+2;
            if (x==13|| x%3==0)
                break;
            System.out.println("*");
        }while (x<=19);
    }
}
