package abstract_factory.interfaz.implementacion;


import abstract_factory.interfaz.IConexionDB;

public class ConexionOracle implements IConexionDB {
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
