package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //  Propiedades
    private static Connection CONEXION = null;

    // Constructor
    private Conexion(){
        String url = "jdbc:mysql://localhost:3306/cursojava";
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String password = "admin";
        try {
            Class.forName(driver);
            CONEXION =DriverManager.getConnection(url, user, password);
            System.out.println("Connection succesfull");
        } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
            System.out.println("Error connecting to database");
        }
    }

    // Para obtener la instancia unicamente por este metodo
    // Notese la palabra "static" hace posible el acceso mediante clase.metodo

    /**
     * Devuelve la conexion a la base de datos
     * @return Un objeto conexion único para toda la aplicacion
     */
    public static Connection getConexion(){
        if(CONEXION == null){
            new Conexion();
        }
        return CONEXION;
    }


}

