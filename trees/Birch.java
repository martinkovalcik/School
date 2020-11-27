package sk.itsovy.kovalcik.trees;

public class Birch extends Tree{
    public Birch(int age) {
        super(age);
    }

    @Override
    public void description() {
        System.out.println("Jeeeej , som bielý strom");
    }
}
