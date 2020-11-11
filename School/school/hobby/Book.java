package sk.itsovy.kovalcik.school.school.hobby;

public class Book extends Hobby {
    private String author;

    public Book(String name,String author) {
        super(name);
        this.author=author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
