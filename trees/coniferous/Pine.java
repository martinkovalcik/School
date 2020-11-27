package sk.itsovy.kovalcik.trees.coniferous;

import sk.itsovy.kovalcik.trees.Coniferous;
import sk.itsovy.kovalcik.trees.Tree;

public class Pine extends Tree implements Coniferous {
    public Pine(int age){
        super(age);
    }

    @Override
    public void description() {
        System.out.println("Som ihličnan");
    }


}
