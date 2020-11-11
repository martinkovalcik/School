package sk.itsovy.kovalcik.school.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arraypool {
    public static void main(String[] args) {
        int[] arr = new int[]{14,0,17,-5,8,36,27,81,0,11};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index 1: ");
        int index1,index2;

        try{
            index1=sc.nextInt();
            System.out.println("Enter index 2: ");
            index2= sc.nextInt();

            int result = getResult(arr[index1],arr[index2]);
            System.out.println("Result: "+result);
        }
        catch (ArithmeticException ex){
            System.out.println("Error "+ex);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Error: "+ex);
        }
        catch (InputMismatchException ex){
            System.out.println("Error: Musis zadať cislo a nie text");
        }
        catch (Exception e){
            System.out.println("Unknown Error: "+e);
        }
        finally {
            System.out.println("This part of code run always!");
        }

    }

    private static int getResult(int a,int b) {
        return a/b;
    }
}
