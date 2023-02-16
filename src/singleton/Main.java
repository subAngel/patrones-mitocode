package singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        String consulta = "SELECT * FROM cursojava.usuarios;";
        try{
            Connection conn = Conexion.getConexion();
            PreparedStatement st;
            st = conn.prepareStatement(consulta);
            ResultSet rs = st.executeQuery(consulta);
            while(rs.next()){
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
