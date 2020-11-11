package sk.itsovy.kovalcik.school.school.animals;

public class Dog implements Animal{
    private String name;
    private String breed;

    public Dog(String name, String breed){
        this.name=name;
        this.breed=breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
