package sk.itsovy.kovalcik.school.school.hobby;

public class Sport extends Hobby {
    private String type;

    public Sport(String name, String type) {
        super(name);
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
