package sk.itsovy.kovalcik.skola.school.animals;

public class Fish implements Animal{
    private int count;
    public Fish(int count){
        this.count=count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
