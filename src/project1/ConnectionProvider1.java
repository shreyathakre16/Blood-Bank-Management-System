/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import java.sql.*;
/**
 *
 * @author shrey
 */
public class ConnectionProvider1 {
    public static Connection getCon()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms","root","root@123");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
}
