package sk.itsovy.kovalcik.school.school.hobby;

public class Cooking extends Hobby {
    private String favoriteFood;

    public Cooking(String name, String favoriteFood) {
        super(name);
        this.favoriteFood=favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}
