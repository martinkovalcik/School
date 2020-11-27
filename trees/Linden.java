package sk.itsovy.kovalcik.trees;


public class Linden extends Tree{
    public Linden(int age) {
        super(age);
    }

    @Override
    public void description() {
        System.out.println("Neviem ani čo som vlastne");
    }
}
