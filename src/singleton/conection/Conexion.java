package singleton.conection;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    // La variable que va a guardar el estado de la conexion a la bd
    private  Connection CONEXION;
    // Variable para crear una sola intancia
    private static Conexion instance;
    private static final String URL = "jdbc:mysql://localhost:3306/samplesingleton";
    private static final String USER = "root";
    private static final String PASS = "admin";

    //
    // Constructor
    private Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            CONEXION = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Database connection succesfull");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error connecting to database");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public synchronized static Conexion getConexion(){
        return instance == null ? instance = new Conexion() : instance;
    }

    public Connection getCnn(){
        return CONEXION;
    }

    public void cerrarConexion(){
        instance = null;
    }

//    public static Connection conectar(){
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            CONEXION = DriverManager.getConnection(URL, USER, PASS);
//            System.out.println("Database connection succesfull");
//            return CONEXION;
//        }catch (Exception e){
//            System.err.println("Error connecting to database");
//            return null;
//        }
//    }

}

