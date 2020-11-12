package sk.itsovy.kovalcik.students;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private int age;
    private double height;
    private int weight;
    private Contact contact;

    public Student(String firstName, String lastName, String id, double height, int weight ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.height=height;
        this.weight=weight;
        contact=null;
        setAge();
    }

    private void setAge() {
        // tu urobime nastavenie veku
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
        SimpleDateFormat dayformat = new SimpleDateFormat("dd");
        Date today = new Date();
        int actualYear = Integer.parseInt(yearFormat.format(today));
        int actualMonth = Integer.parseInt(monthFormat.format(today));
        int actualDay = Integer.parseInt(dayformat.format(today));
        int year;
        int studentYear = Integer.parseInt(id.substring(0, 2));

        if (studentYear < 20) {
            year = 2000 + studentYear;
        } else {
            year = 1900 + studentYear;
        }

        int studentMonth = Integer.parseInt(id.substring(2,4));
        if (studentMonth > 50) {
            studentMonth = studentMonth - 50;
        }

        int studentDay = Integer.parseInt(id.substring(4,6));
        if (actualMonth < studentMonth) {
            age = actualYear - year - 1;
        } else if (actualMonth > studentMonth) {
            age = actualYear - year;
        } else {
            if (actualDay <= studentDay) {
                age = actualYear - year - 1;
            } else {
                age = actualYear - year;
            }
        }
    }
    public Gender getGender(){
        return id.charAt(2)<'2' ? Gender.MALE:Gender.FEMALE;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
