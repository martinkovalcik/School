package sk.itsovy.kovalcik.trees;

public class Spruce extends Tree{
    public Spruce(int age) {
        super(age);
    }

    @Override
    public void description() {
        System.out.println("Som tmavý... VELMI TMAVÝ!");
    }
}
