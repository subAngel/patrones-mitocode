package factory.interfaz.implem;

import factory.interfaz.IConexion;

public class ConexionOracle implements IConexion {
    private String host, puerto, user, password;
    public ConexionOracle(){
        this.host = "localhost";
        this.puerto = "1521";
        this.user = "admin";
        this.password = "root";
    }

    @Override
    public void conectar() {
        System.out.println("Conectando a OracleDB");
    }

    @Override
    public void desconectar() {
        System.out.println("Cerrando conexion a OracleDB");
    }
}
