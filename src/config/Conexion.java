package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    Connection conn;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", "root", "admin");
        } catch (Exception e) {
        }
    }

    public Connection getConnection() {
        return conn;
    }
}
