//package sk.itsovy.kovalcik.database;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//public class Database {
//
//
//    public void showCities(String Country){
//        beQuiet pssst = new beQuiet();
//        try {
//            String query = "SELECT city.Name, city.CountryCode " +
//                    "FROM city " +
//                    "INNER JOIN country ON country.code = city.CountryCode " +
//                    "WHERE country.name LIKE ?";  //? znamemná že tam dačo chýýýba sú očíslované tie otázniky
//            //  Class.forName("com.mysql.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(pssst.getUrl(), pssst.getUsername(),pssst.getPassword());
//            if(conn!=null){
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                System.out.println("Done");
//                PreparedStatement ps = conn.prepareStatement(query);
//                System.out.println(ps);
//
//
//                ps.setString(1,Country);  // ošetrenie.. overuje či to je string..
//
//
//                ResultSet rs = ps.executeQuery();  // tu ho už spúšťa
//                while (rs.next()){
//                    String city = rs.getString("Name");
//                    String code = rs.getString("CountryCode");
//                    String country = rs.getString("CountryCode");
//                    System.out.println(city+ " "+code);
//                }
//                conn.close();
//
//            }
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//
//}
