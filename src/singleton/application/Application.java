package singleton.application;

import singleton.conection.Conexion;

import java.sql.*;

public class Application {
    public Application(){
    }
    public Connection conectar(){
        Connection conn = Conexion.getConexion("jdbc:mysql://localhost:3306/samplesingleton", "root", "admin");
        return conn;
    }
    public void visualizar(){
        try {
            String query = "SELECT * FROM tabla;";
            PreparedStatement pst = conectar().prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            System.out.println("---------------------------------------------------------------");
            System.out.printf("%3s \t %30s \t %8s \t %6s", "ID", "DESCRIPCION", "CANTIDAD", "PRECIO");
            System.out.println("\n---------------------------------------------------------------");

            while(rs.next()){
                System.out.printf("%3s \t %30s \t %8s \t %6s\n",
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4) );
            }
            System.out.println("---------------------------------------------------------------");
            System.out.printf("\t\t\t\t\t\t TOTAL: %6s", calcularTotal());
        } catch (SQLException ex){
//            ex.printStackTrace();
            System.err.println("Error al visualizar los datos");

        }

    }
    private String calcularTotal(){
        String query = "select sum(cantidad*precio) from tabla;";
        try {
            PreparedStatement pst = conectar().prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            return rs.getString(1);
        }catch (SQLException exception){
//            exception.printStackTrace();
            return "Error";
        }
    }
    public void manipular(){

    }
}
