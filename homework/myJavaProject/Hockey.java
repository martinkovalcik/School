package sk.itsovy.kovalcik.homework.myJavaProject;

public class Hockey extends Sport{
    public Hockey(int size, boolean protection) {
        super(size, protection);
    }

    @Override
    public void amISport() {
        System.out.println("I like Puck");
    }
}
