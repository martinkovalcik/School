package sk.itsovy.kovalcik.trees.fruits;

import sk.itsovy.kovalcik.trees.Tree;

public class AppleTree extends Tree {

    public AppleTree(int age) {
        super(age);
    }

    @Override
    public void description() {
        System.out.println("Vela jablllllk");
    }

    @Override
    public void getFruit() {
        System.out.println("Mám veľa jablllllk?");
    }
}
