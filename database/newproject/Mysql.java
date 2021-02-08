package sk.itsovy.kovalcik.database.newproject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Database {
    private String url="jdbc:mysql://localhost:3306/test";
    private String username="root";
    private String password="";

    public List<City> getCities(String countryCode){
        String query="SELECT city.Name, JSON_EXTRACT(Info,'$Population') AS Population "+
                     "FROM city "+
                     "INNER JOIN country ON country.code = city.CountryCode "+
                     "WHERE country.name LIKE ? ORDER BY Population DESC";
        List<City> cityList=new ArrayList<>();
try {
    Connection conn = getConnection();
    if(conn!=null){
        System.out.println("Success");
        PreparedStatement ps= conn.prepareStatement(query);
        System.out.println(ps);
        ps.setString(1,countryCode);
        ResultSet rs= ps.executeQuery();
        while(rs.next()){
            String name=rs.getString("Name");
         // String code=rs.getString("CountryCode");
            int pop=rs.getInt("Population");
        //    City city=new City(name,pop);
          //  cityList.add(city);

        }
        conn.close();
    }
}catch (Exception e){
    e.printStackTrace();
}
return cityList;
    }

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn= DriverManager.getConnection(url,username,password);
        return conn;
    }

    public Country getCountryInfo(String country){
        String query="SELECT country.name, country.code, city.name "+
                     "FROM country "+
                     "INNER JOIN city ON country.Capital = city.ID "+
                     "WHERE country.name LIKE ?";
        Country countryInfo=null;
        try {
            Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, country);
            ResultSet rs= ps.executeQuery();
            if (rs.next()){
                String unicCode= rs.getString("country.code");
                String capital= rs.getString("city.name");
                System.out.println(capital+" "+unicCode);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return countryInfo;
    }
    public String getCountryCode(String name) {
        if (name == null || name.equalsIgnoreCase(""))
            return null;
        try {
            Connection con = getConnection();
            String query = "SELECT Code FROM country WHERE Name LIKE ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String code = rs.getString("Code");
                return code;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
        public void insertCity(City newCity) {

            String country = newCity.getCountry();
            String code3 = getCountryCode(country);
            if(code3==null){
                System.out.println("Warning! Country "+country+" does not exist! ");
            }
            else{
                newCity.setUnicCode(code3);
                String query = "INSERT INTO city (Name, CountryCode, District, Info) " +
                        "VALUES( ?,?,?,?) ";
                try {
                    Connection con = getConnection();
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1,newCity.getName());
                    ps.setString(2,newCity.getUnicCode());
                    ps.setString(3,newCity.getDistrict());
                    String json="{ \"Population\":"+newCity.getPopulation()+"}";
                    ps.setString(4,json);
                    boolean result= ps.execute();
                    System.out.println("Result: "+result);
                    con.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }

    public void updatePopulation(String country, String city, int population){
     //   String country = city.getCountry();
        String code3 = getCountryCode(country);
        if(code3==null){
            System.out.println("Warning! Country "+country+" does not exist! ");
        }
        City newPopulation = null;
        population=newPopulation.getPopulation();

        String query="INSERT INTO city (Population) " +
                     "VALUES( ?) ";

        try {
            Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, country);
            ps.setString(2, city);
            ps.setString(3, String.valueOf(population));
           // String json="{\\\"Population\\\":"++"}";



        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<CapitalCity> getCapitalCity(String continent){
        String query="SELECT city.Name, AS Name ," +
                "JSON_EXTRACT(Info,'$Population') AS Population "+
                "FROM country "+
                "INNER JOIN city ON country.Capital = city.ID "+
                "INNER JOIN countryinfo ON country.code = countryinfo._id "+
                "WHERE JSON_UNQUOTE(JSON_EXTRACT(doc, '$.geography.Continent')) like ?";
        List<CapitalCity> cityList=new ArrayList<>();
        try {
            Connection conn = getConnection();
            if(conn!=null){
                System.out.println("Success");
                PreparedStatement ps= conn.prepareStatement(query);
                System.out.println(ps);
                ps.setString(1,continent);
                ResultSet rs= ps.executeQuery();
                while(rs.next()){
                    String name=rs.getString("Name");
                    String country=rs.getString("country");
                    int pop=rs.getInt("Population");

                }
                conn.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
