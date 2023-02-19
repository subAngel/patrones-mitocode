package singleton;

import singleton.conection.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainSingleton {
    public static void main(String[] args) {

//        String consulta = "SELECT * FROM tabla;";
//        try{
//            Connection conn = Conexion.getConexion("jdbc:mysql://localhost:3306/samplesingleton", "root", "admin");
//            PreparedStatement st;
//            st = conn.prepareStatement(consulta);
//            ResultSet rs = st.executeQuery(consulta);
//            while(rs.next()){
//                System.out.println("| " +rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | "+rs.getString(4));
//            }
//        }catch (SQLException ex){
//            ex.printStackTrace();
//        }
    }
}
