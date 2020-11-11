package sk.itsovy.kovalcik.school.school.hobby;

public class Movie extends Hobby {
    private int publication;

    public Movie(String name, int publication) {
        super(name);
        this.publication=publication;
    }

    public int getPublication() {
        return publication;
    }

    public void setPublication(int publication) {
        this.publication = publication;
    }
}
