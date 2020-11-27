package sk.itsovy.kovalcik.trees;

public class Oak extends Tree{
    public Oak(int age) {
        super(age);
    }

    @Override
    public void description() {
        System.out.println("som DUB!");
    }
}
