package sample;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
        private String url="jdbc:mysql://itsovy.sk:3306/chat2021";
        private String username="mysqluser";
        private String password="Kosice2021!";
        private final String insertNewUser="INSERT INTO user (login, password) VALUES (?, ?) ";
        private final String loginUser="SELECT * FROM user WHERE login LIKE ? AND password LIKE ? ";
        private final String newMessage="";
        private final String toUser="";
        private final String newPassword="";
        private final String myOldMesages="";
        private final String userID="";
        private final String deleteMsg="";

    private Connection getConnection() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection(url,username,password);
            return conn;
        }
//------------------------------------------------------------------------------------------------------
        public boolean insertNewUser(String login, String password){
            if(login==null || login.equals("") || password==null || password.length()<6)
                return false;

            String hpwd= new Util().MD5(password);
            try{
                Connection conn=getConnection();
                if (conn==null){
                    System.out.println("error");
                    return false;
                }else{
                    PreparedStatement ps=conn.prepareStatement(insertNewUser);
                    ps.setString(1,login);
                    ps.setString(2, hpwd);
                    int result=ps.executeUpdate();
                    conn.close();
                    if (result==0)
                        return false;
                    else {
                        return true;
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            return true;
        }
        //------------------------------------------------------------------------
        public Users loginUser(String login,String password){
            if(login==null || login.equals("") || password==null || password.length()<6)
                return null;
            String hpwd=new Util().MD5(password);
            try {
                Connection conn=getConnection();
                if (conn==null){
                    System.out.println("error");
                    return null;
                }
                PreparedStatement ps= conn.prepareStatement(loginUser);
                ps.setString(1, login);
                ps.setString(2, hpwd);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    System.out.println("logged");
                    int id=rs.getInt("id");
                    Users user=new Users(login, hpwd, id);
                    conn.close();
                    return user;
                }else{
                    conn.close();
                    return null;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return null;
        }

        //-----------------------------------------------------------------------------
        public boolean sendMessage(int from,int to,String text){
            if(text==null || text.equals(""))
                return false;
             to=getUserId(toUser);
            if (to==-1)
                return false;
            try {
             Connection conn=getConnection();
             if (conn==null){
                 System.out.println("error");
                 return false;
             }
             PreparedStatement ps= conn.prepareStatement(newMessage);
             ps.setInt(1, from);
             ps.setInt(2, to);
             ps.setString(3, text);
             int rs= ps.executeUpdate();
                if (rs<1){
                    System.out.println("Message not sent.");
                    conn.close();
                    return false;
                }else{
                    System.out.println("Message sent.");
                    conn.close();
                    return true;
                }

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return true;
        }
        //------------------------------------------------------------------------------
        public boolean changePwd(String login, String oldPwd, String newPwd){
            if (oldPwd == null || oldPwd.equals("") || newPwd==null || newPwd.equals(""))
                return  false;
            try {
                Connection conn=getConnection();
                if (conn==null){
                    System.out.println("error");
                    return false;
                }
                PreparedStatement ps= conn.prepareStatement(newPassword);
                ps.setString(1, login);
                ps.setString(2, oldPwd);
                ps.setString(3, newPwd);
                int rs= ps.executeUpdate();
                if (rs<1){
                    System.out.println("Error.");
                    conn.close();
                    return false;
                }else{
                    System.out.println("password changed.");
                    conn.close();
                    return true;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return true;
        }
        //--------------------------------------------------------------------------------
        public List<Messages> getMyMessages(String login){
            if(login==null || login.equals(""))
                return null;
            List<Messages> messagesList=new ArrayList<>();
            try{
                Connection conn=getConnection();
                if (conn==null){
                    System.out.println("error");
                    return null;
                }
                PreparedStatement ps= conn.prepareStatement(myOldMesages);
                ps.setString(1, login);
                ResultSet rs= ps.executeQuery();
                while(rs.next()){
                    String user= rs.getString("Message");
                }
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return messagesList;
        }
        //--------------------------------------------------------------------------------------------
        public int getUserId(String login){
            if(login==null || login.equals(""))
            return -1;
            try{
                Connection conn=getConnection();
                PreparedStatement ps= conn.prepareStatement(userID);
                ps.setString(1, login);
                ResultSet rs=ps.executeQuery();
                System.out.println(ps);
                if (rs.next()){
                    int id= rs.getInt("id");
                    conn.close();
                    return id;
                }else{
                    return -1;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return 0;
        }
        //---------------------------------------------------------------------------------
        public boolean deleteMessages(String login){
            if(login==null || login.equals(""))
            return false;
            try{
                Connection conn=getConnection();
                PreparedStatement ps= conn.prepareStatement(deleteMsg);
                ps.setString(1, login);
                int rs= ps.executeUpdate();
                if (rs<1){
                    System.out.println("Messages are not deleted.");
                    conn.close();
                    return false;
                }else{
                    System.out.println("Messages are deleted.");
                    conn.close();
                    return true;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return true;
        }
}
