package sk.itsovy.kovalcik.javajson;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Json {
    public void getJsonData(){

    }

    public void getCityData(String filepath){
        JSONParser jsonParser = new JSONParser();

        try {
            Reader reader = new FileReader(filepath);
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            JSONArray data = (JSONArray) jsonObject.get("data");



            for (int i = 0; i < data.size(); i++) {

                JSONObject city = (JSONObject) data.get(i);
                System.out.println();
                String wikiDataId = (String) city.get("wikiDataId");
                System.out.println("WikiDataId:"+wikiDataId);
                String cityName = (String) city.get("name");

                System.out.println("City name: " + cityName);

                String region = (String) city.get("region");

                System.out.println("Region: " + region);

                double latitude = (double) city.get("latitude");

                System.out.println("latitude: " + latitude);

                double longitude = (double) city.get("longitude");

                System.out.println("longitude: " + longitude);


            }






        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
