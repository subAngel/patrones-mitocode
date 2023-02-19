package singleton.application;

import singleton.conection.Conexion;

import java.sql.*;

public class Application {

    private static final Conexion con = Conexion.getConexion();

    public Application(){
    }



    public void visualizar(){
        try {
            String query = "SELECT * FROM tabla;";
            PreparedStatement pst = con.getCnn().prepareStatement(query);
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

            System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t TOTAL: %6s\n", calcularTotal());
        } catch (SQLException ex){
//            ex.printStackTrace();
            System.err.println("Error al visualizar los datos");

        }

    }
    public String calcularTotal(){
        try {
            String sql = "SELECT SUM(cantidad*precio) AS total FROM tabla;";
            PreparedStatement pst = con.getCnn().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return rs.getString(1);
            }
            System.out.println(rs.getString(1));
            return "Null";
        }catch (SQLException exception){
            exception.printStackTrace();
            return "Error";
        }
    }
    public boolean insertar(String descripcion, int cantidad, double precio){
        try {
            String sql = "insert into tabla (description, cantidad, precio) values (?,?,?);";
            PreparedStatement ps = con.getCnn().prepareStatement(sql);
            ps.setString(1, descripcion);
            ps.setInt(2, cantidad);
            ps.setDouble(3, precio);
//            ResultSet rs = ps.executeQuery();
            if (ps.executeUpdate()>0){
                System.out.println("Insertado correctamente");
                return true;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
            System.err.println("Error al insertar");
            return false;
        }
        return false;
    }
}
