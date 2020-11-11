package sk.itsovy.kovalcik.skola.school;

import sk.itsovy.kovalcik.skola.school.animals.*;
import sk.itsovy.kovalcik.skola.school.hobby.*;

import java.time.LocalDate;

public class Student {
    private String firstName;
    private String lastName;
    private ClassName className;
    private int salary;
    private LocalDate dob;
    private Grades grades;
    private Hobby[]hobbies;
    private int countHobbies;
    private Animal pet;

    public Student(String firstName, String lastname, Grades grades, ClassName className){
        this.firstName = firstName;
        this.lastName = lastname;
        this.grades = grades;
        this.className = className;
        hobbies=new Hobby[5];
        countHobbies=0;
        pet=null;
    }

    public Student(String fname, String lastName, Grades grades, ClassName className, LocalDate dob ){
        this(fname,lastName,grades,className);
        this.dob=dob;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ClassName getClassName() {
        return className;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Grades getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName+" "+getGrades().getAverage();
    }

    public void addHobby(Hobby newHobby){  // keby toto nebolo, vyhodí sa indexOutOfBoundException
        int length =hobbies.length;
        if (countHobbies==length){
            System.out.println("Error, you cannot add another hobby");
            return;
        }
        hobbies[countHobbies+=1]=newHobby;

    }

    public void printHobbies(){
        System.out.println("Student´s hobby");
        for (int i = 0; i < countHobbies; i++) {
//            System.out.println(hobbies[i].getName());
            if (hobbies[i] instanceof Book){
                System.out.print(hobbies[i].getName() + " ");
                System.out.print(((Book) hobbies[i]).getAuthor());
                System.out.println();
            }
            if (hobbies[i] instanceof Cooking){
                System.out.print(hobbies[i].getName() + " ");
                System.out.print(((Cooking) hobbies[i]).getFavoriteFood());
                System.out.println();
            }
            if (hobbies[i] instanceof Gaming){
                System.out.print(hobbies[i].getName() + " ");
                System.out.print(((Gaming) hobbies[i]).getGenre());
                System.out.println();
            }
            if (hobbies[i] instanceof Movie){
                System.out.print(hobbies[i].getName() + " ");
                System.out.print(((Movie) hobbies[i]).getPublication());
                System.out.println();
            }
            if (hobbies[i] instanceof Sport){
                System.out.print(hobbies[i].getName() + " ");
                System.out.print(((Sport) hobbies[i]).getType());
                System.out.println();
            }

        }
    }

    public void choosePet(Animal animal){
        if (animal==null){
        }
        else if (animal instanceof Dog){
            pet = animal;
        }
        else if(animal instanceof Cat)
            pet = animal;
        else if (animal instanceof Lizard)
            pet = animal;
        else if (animal instanceof Fish)
            pet = animal;
    }

    public void printPet(){
        System.out.println("Student´s pets");
        if (pet==null)
            System.out.println("You dont have any pet");
        else if (pet instanceof Dog)
            System.out.println("You have a dog with name: "+ ((Dog) pet).getName()+ " - Which breed is: "+ ((Dog) pet).getBreed());
        else if (pet instanceof Cat)
            System.out.println("You have a cat with name: "+ ((Cat) pet).getName());
        else if (pet instanceof Lizard)
            System.out.println("You have a Lizard with name: "+((Lizard) pet).getName());
        else if (pet instanceof Fish)
            System.out.println("You have: "+((Fish) pet).getCount()+" Fishes");
        System.out.println();
        System.out.println();
    }


}


