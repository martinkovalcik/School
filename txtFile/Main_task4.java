package sk.itsovy.kovalcik.txtFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main_task4 {
    public static void main(String[] args) throws FileNotFoundException {
        int a = null;
        String b = null;

        Scanner s1 = new Scanner(new File("C:/Users/Kovi/IdeaProjects/skola/src/sk/itsovy/kovalcik/txtFile/c.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (s1.hasNext()){
            list.add(s1.next());
        }
        s1.close();


        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                a=list.get(i);
                b=list.get(j);
                if (){

                }
            }
        }
    }
}
