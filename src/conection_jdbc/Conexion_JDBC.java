package conection_jdbc;

/**
 *
 * @author Ana Valencia
 */


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Conexion_JDBC {

    private static String user="root";
    private static String password="";
    private static String url="jdbc:mysql://localhost:3306/mydb";    
   
      // Método para obtener una conexión a la base de datos
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos");
            e.printStackTrace(); // Imprime el error detallado
        }
        return connection;
    } 
}
