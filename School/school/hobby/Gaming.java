package sk.itsovy.kovalcik.skola.school.hobby;

public class Gaming extends Hobby{
    private String genre;

    public Gaming(String name,String genre) {
        super(name);
        this.genre=genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
