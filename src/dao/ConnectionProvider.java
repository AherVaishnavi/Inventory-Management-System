/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;

/**
 *
 * @author technOrbit
 */
public class ConnectionProvider {
    public static Connection getConn(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?useSSL=false","root","123456");
           return con;
                   }
       catch(Exception e){
           System.out.println(e);
           return null;
       }
    }
    
}
