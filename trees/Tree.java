package sk.itsovy.kovalcik.trees;

public abstract class Tree {

    private int age;

    public Tree(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public abstract void description();

    public void getFruit(){
        System.out.println("Nemám žiadne ovocie");
    }
}
