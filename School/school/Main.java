package sk.itsovy.kovalcik.skola.school;

import sk.itsovy.kovalcik.skola.school.hobby.*;
import sk.itsovy.kovalcik.skola.school.animals.*;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args){
//        //vytvorenie 1 studenta
//        Grades gradesS1 = new Grades(3,2,1);
//        Student s1 = new Student("Marek", "Baca", gradesS1, ClassName.N1);
//        LocalDate datum = LocalDate.of(2000, Month.MARCH, 9);
//        s1.setDob(datum);
//        System.out.println("Meno: " + s1.getFirstName() + " narodený " + s1.getDob());
//
//        //vytvorenie 2 studenta
//        Student s2 = new Student("Jakub", "Novak", null, ClassName.N2);
//        datum = LocalDate.of(2003, Month.JANUARY, 5);
//        s2.setDob(datum);
//        System.out.println("Meno: " + s2.getFirstName() + " narodený " + s2.getDob());
//
//        //vytvorenie 3 studenta
//        Student s3 = new Student("Janko", "Mrazik", null, ClassName.N2);
//        datum = LocalDate.of(1996, Month.APRIL, 18);
//        s3.setDob(datum);
//        System.out.println("Meno: " + s3.getFirstName() + " narodený " + s3.getDob());


        Student[] students;

        students = initStudents();

        Book b1 = new Book("Hlava XXII","J. Heller");
        students[0].addHobby(b1);

        Dog dog1= new Dog("Dyna","German Shepherd");
        students[1].choosePet(dog1);

        Book b2 = new Book("Marina","A. Sladkovic");
        students[1].addHobby(b2);

        Sport s1=new Sport("Hockey","indoor");
        students[0].addHobby(s1);

        Movie m1=new Movie("Aladin",2019);
        students[0].addHobby(m1);

        Cooking c1=new Cooking("Meat food","Meat Jelly");
        students[1].addHobby(c1);

        Gaming g1=new Gaming("World of Warcraft","RPG");
        students[1].addHobby(g1);

        Cat cat1= new Cat("Bruno","Persian Cat");
        students[2].choosePet(cat1);

        Gaming g2=new Gaming("League of Legends","MMO RPG");
        students[2].addHobby(g2);

        Gaming g3=new Gaming("Counter Strike:GO","FPS");
        students[4].addHobby(g3);

        Cooking c2=new Cooking("Pasta","Spaghetti");
        students[3].addHobby(c2);

        Movie m2=new Movie("EarthQuake",2016);
        students[3].addHobby(m2);

        Movie m3=new Movie("Insterstellar",2011);
        students[4].addHobby(m3);

        Book b3 = new Book("Hlava XXII","J. Heller");
        students[4].addHobby(b3);

        Sport s2=new Sport("Soccer","outdoor");
        students[4].addHobby(s2);

        Fish fish1= new Fish(20);
        students[4].choosePet(fish1);

//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i].getLastName());
//        }

        for (Student s: students) {
            System.out.println("Student's last name: " + s.getLastName());
            System.out.println("Student's first name: " + s.getFirstName());
            System.out.println("Student's class name: " +s.getClassName());
            System.out.println("Student's date of birth: " +s.getDob());
            System.out.println("Student's hobbies: ");
            s.printHobbies();
            System.out.println("Student´s pets: ");
            s.printPet();
            System.out.println("\n\n\n\n");

        }





    }



    private static Student[] initStudents() {
        Student[] students= new Student[5];

        // 1. student
        Grades grades1 = new Grades(5, 5, 5);

        Student student1 = new Student("Miloš", "Zeman",
                grades1, ClassName.N3, LocalDate.of(1967, Month.AUGUST, 9));
        students[0] = student1;

        // 2. student
        Grades grades2 = new Grades(2, 4, 1);

        Student student2 = new Student("Gabriela", "Zaujecova",
                grades2, ClassName.N1, LocalDate.of(1997, Month.MARCH, 16));
        students[1] = student2;

        // 3. student
        Grades grades3 = new Grades(3, 2, 1);

        Student student3 = new Student("Martin", "Dolinský",
                grades3, ClassName.N2, LocalDate.of(2000, Month.MARCH, 21));
        students[2] = student3;

        // 4. student
        Grades grades4 = new Grades(1, 2, 3);

        Student student4 = new Student("Jan", "Frajer",
                grades4, ClassName.N3, LocalDate.of(1996, Month.JUNE, 4));
        students[3] = student4;

        // 5. student1
        Grades grades5 = new Grades(1, 1, 1);

        Student student5 = new Student("Roland", "Kovalčík",
                grades5, ClassName.N1, LocalDate.of(1952, Month.DECEMBER, 29));
        students[4] = student5;

        return students;
    }

    private static void sortByAverage(Student[] students) {

        for(int i = 0;i<=students.length-1;i++){
            for(int j=0; j< students.length-1-i;j++){
                if(students[j].getGrades().getAverage()>students[j+1].getGrades().getAverage()){
                    Student temp = students[j];
                    students[j]=students[j+1];
                    students[j+1] = temp;

                }
            }
        }
    }

}
