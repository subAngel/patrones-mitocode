package factory.interfaz.implem;

import factory.interfaz.IConexion;

public class ConexionPostgreSQL implements IConexion {
    private String host, puerto, user, password;
    public ConexionPostgreSQL(){
        this.host = "localhost";
        this.puerto = "5433";
        this.user = "postgres";
        this.password = "admin";
    }


    @Override
    public void conectar() {
        System.out.println("Se conecto a PostgreSQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto de PostgreSQL");
    }
}
