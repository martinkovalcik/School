package sk.itsovy.kovalcik.school.factorial;

public class Factorial {
    public static void main(String[] args) {
        int number=faktorial(4);
        System.out.println("Result is: "+number);
    }
    private static int faktorial(int a){
        if (a==1){
            return 1;
        }else {
            return a*faktorial(a-1);
        }

    }

}
