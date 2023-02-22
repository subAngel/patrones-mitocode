package abstract_factory;

import abstract_factory.interfaz.FabricaAbstracta;
import abstract_factory.interfaz.IConexionDB;
import abstract_factory.interfaz.IConexionREST;
import abstract_factory.interfaz.implementacion.ConexionMySQL;
import abstract_factory.interfaz.implementacion.ConexionOracle;
import abstract_factory.interfaz.implementacion.ConexionPostgreSQL;
import abstract_factory.interfaz.implementacion.ConexionVacia;

public class ConexionBDFabrica implements FabricaAbstracta {

    @Override
    public IConexionDB getBD(String motor) {
        if(motor == null){
            return new ConexionVacia();
        }
        if(motor.equalsIgnoreCase("MYSQL")){
            return new ConexionMySQL();
        } else if (motor.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracle();
        } else if (motor.equalsIgnoreCase("POSTGRE")) {
            return new ConexionPostgreSQL();
        }return new ConexionVacia();
    }

    @Override
    public IConexionREST getREST(String area) {
        return null;
    }
}
