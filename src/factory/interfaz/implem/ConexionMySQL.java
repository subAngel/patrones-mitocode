package factory.interfaz.implem;

import factory.interfaz.IConexion;


public class ConexionMySQL implements IConexion {
    private String host;
    private String port;
    private String user;
    private String password;

    public ConexionMySQL(){
        this.host = "localhost";
        this.port = "3306";
        this.user = "root";
        this.password = "admin";
    }

    @Override
    public void conectar() {
        System.out.println("Se conecto a mysql");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto mysql");
    }
}
