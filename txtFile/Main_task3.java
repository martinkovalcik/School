package sk.itsovy.kovalcik.txtFile;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_task3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s1 = new Scanner(new File("C:/Users/Kovi/IdeaProjects/skola/src/sk/itsovy/kovalcik/txtFile/a.txt"));
        Scanner s2 = new Scanner(new File("C:/Users/Kovi/IdeaProjects/skola/src/sk/itsovy/kovalcik/txtFile/b.txt"));
        ArrayList<String> list = new ArrayList();
        while (s1.hasNext()){
            list.add(s1.next());
        }
        s1.close();

        while (s2.hasNext()){
            list.add(s2.next());
        }
        s2.close();

        try {
            File myObj = new File("C:/Users/Kovi/IdeaProjects/skola/src/sk/itsovy/kovalcik/txtFile/c.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("C:/Users/Kovi/IdeaProjects/skola/src/sk/itsovy/kovalcik/txtFile/c.txt");
            myWriter.write(String.valueOf(list));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
}
