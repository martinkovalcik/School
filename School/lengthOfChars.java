package sk.itsovy.kovalcik.school;

public class LengthOfChars {
    public static void main(String[] args) {
        String data =" Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods. " ;
        int pocet = 0;
        for (int i = 0; i < data.length() ; i++) {
            char result=data.charAt(i);
            if (result=='a' || result=='A'){
                pocet++;
            }
            else if (result=='e' || result=='E'){
                pocet++;
            }
            else if (result=='i' || result=='I'){
                pocet++;
            }
            else if (result=='o' || result=='O'){
                pocet++;
            }
            else if (result=='u' || result=='U'){
                pocet++;
            }
            else if (result=='y' || result=='Y'){
                pocet++;
            }
        }
        System.out.println(pocet);
    }
}
