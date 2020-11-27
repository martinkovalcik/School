package sk.itsovy.kovalcik.homework.myJavaProject;

public class Sport {
    private int size;
    private boolean protection;


    public Sport(int size, boolean protection){
        this.size=size;
        this.protection=protection;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isProtection() {
        return protection;
    }

    public void setProtection(boolean protection) {
        this.protection = protection;
    }

    public void amISport(){
        System.out.println("Yes, I´m type of sport");
    }
}
