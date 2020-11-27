package sk.itsovy.kovalcik.homework.myJavaProject;

public class Football extends Sport{
    public Football(int size, boolean protection) {
        super(size, protection);
    }

    @Override
    public void amISport() {
        System.out.printf("I like ball");
    }
}
