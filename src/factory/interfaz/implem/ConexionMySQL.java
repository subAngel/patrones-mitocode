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
    }

    @Override
    public void conectar() {

    }

    @Override
    public void desconectar() {

    }
}
