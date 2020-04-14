package com.lab8;

import java.sql.*;
// vom face conexiunea la Baza de date sql din oracle
public class Database {

    private static Database single_instance=null;
    public String url="jdbc:oracle:thin:@localhost:1521:xe";
    public String user="STUDENT";
    public String password="STUDENT";
    private static Object EnumType;
    Database() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // acest driver este recunoscut de aplicatia sql developer de la oracle
            // am adaugat o biblioteca externa numita ojdbc14.jar
            Connection con = DriverManager.getConnection(url, user, password);//ne vom loga la xe localhost 1521 din oracle
            Statement stmt = con.createStatement();//vom scrie comenzi
            ResultSet myResult = stmt.executeQuery("select * from artists");
            ResultSet myResult2 = stmt.executeQuery("select * from albums");
            while (myResult.next() && myResult2.next()) {
                System.out.println(myResult.getString("name") + " " + myResult.getInt("id"));
                System.out.println(myResult.getString("name") + " " + myResult.getInt("artistId"));
            }
            con.close();// com inchide conexiunea
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static Database getInstance()  {//aici vom aplca metoda singleton
        if(single_instance==null)
            single_instance=new Database();
        return single_instance;
    }

}
