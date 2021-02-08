package sk.itsovy.kovalcik.database.newproject;

public class Country {
    private String name;
    private String unicCode;
    private String capitalCity;
    private int area;
    private String continent;

    public Country(String name, String unicCode, String capitalCity, int area, String continent) {
        this.name = name;
        this.unicCode = unicCode;
        this.capitalCity = capitalCity;
        this.area = area;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public String getUnicCode() {
        return unicCode;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public int getArea() {
        return area;
    }

    public String getContinent() {
        return continent;
    }
}

