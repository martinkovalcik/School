package sk.itsovy.kovalcik.students;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Student[] array=null;
        array = readStudentsFromFile(array);
        printAllStudents(array);
        printAllWomens(array);

        for (Student student : array) {
            System.out.println(student.getId() + " " + student.getAge());

        }
    }

    private static Student[] readStudentsFromFile(Student[] array) {
        try {
            FileReader fr = new FileReader("resource/students.dat");
            String line;
            BufferedReader bf = new BufferedReader(fr);
            line=bf.readLine();
            int num = Integer.parseInt(line);
            System.out.println("File contains "+num+" records");
            array = new Student[num];
            for(int i=0;i<num;i++){
                line=bf.readLine();
                String[] temp = line.split(" ");
                double height=Double.parseDouble(temp[3]);
                int weight=Integer.parseInt(temp[4]);
                Student s = new Student(temp[0],temp[1],temp[2],height,weight);
                array[i]=s;
            }
            fr.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return array;
    }

    public static void printAllStudents(Student[] array){
        System.out.println("List of all students: ");

        int len=array.length;
        for(int i=0;i<len;i++){
            System.out.println("   "+array[i].getFirstName()+" "+array[i].getLastName() + " "+array[i].getHeight());
        }
    }

    public static void printAllWomens(Student[] array){
        System.out.println("List of all womens: ");
        for(Student temp : array){
            if(temp.getGender()==Gender.FEMALE)
                System.out.println("   "+temp.getFirstName()+" "+temp.getLastName());
        }
    }



}
