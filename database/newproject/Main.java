package sk.itsovy.kovalcik.database.newproject;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Database database=new Database();
        Output out=new Output();
        String countryCode="France";
        database.getCountryInfo("France");
        List<City> cityList=database.getCities("");
        out.printCities(cityList);
        }

    }