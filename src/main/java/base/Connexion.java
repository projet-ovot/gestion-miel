package base;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author superharivony
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    
    public Connection getConnection(){
        String url = "jdbc:postgresql://localhost:5432/miel";
        String user = "postgres";
        String password = "bozy";
        try {
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
        }
        return null;
    }
}
