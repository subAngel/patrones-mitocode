package abstract_factory.interfaz.implementacion;

import abstract_factory.interfaz.IConexionDB;

public class ConexionMySQL implements IConexionDB {
    private String port, user, password;
    public ConexionMySQL(){
        this.port = "3306";
        this.user = "user";
        this.password="pass";
    }
    @Override
    public void conectar() {
        System.out.println("Conectado a mysql");
    }

    @Override
    public void desconectar() {
        System.out.println("desconectado de mysql");
    }
}
