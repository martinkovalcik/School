package sk.itsovy.kovalcik.database.newproject;

public class City {
    private String name;
    private int population;
    private String country;
    private String unicCode;
    private String district;

    public City(String name, String country, String unicCode, String district, int population){
    this.name=name;
    this.population=population;
    this.country = country;
    this.unicCode = unicCode;
    this.district = district;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getCountry() {
        return country;
    }

    public void setUnicCode(String unicCode) {
    }

    public String getUnicCode() {
        return unicCode;
    }

    public String getDistrict() {
        return district;
    }
}
