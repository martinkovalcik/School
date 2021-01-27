package sk.itsovy.kovalcik.javajson;

public class Main {
    public static void main(String[] args) {
        Json json = new Json();

        json.getCityData("../skola/resource/cities_slovak.json");
    }
}
