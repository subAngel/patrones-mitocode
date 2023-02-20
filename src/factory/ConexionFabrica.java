package factory;

import factory.interfaz.IConexion;
import factory.interfaz.implem.ConexionMySQL;
import factory.interfaz.implem.ConexionOracle;
import factory.interfaz.implem.ConexionPostgreSQL;
import factory.interfaz.implem.ConexionVacia;

public class ConexionFabrica {
    public IConexion getConexion(String motor){
        if(motor == null){
            return new ConexionVacia();
        }
        if(motor.equalsIgnoreCase("MYSQL")){
            return new ConexionMySQL();
        }else if(motor.equalsIgnoreCase("ORACLE")){
            return new ConexionOracle();
        }else if(motor.equalsIgnoreCase("POSTGRE")){
            return new ConexionPostgreSQL();
        }
        return new ConexionVacia();
    }
}
