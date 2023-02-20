package factory;

import factory.interfaz.IConexion;

public class Main {
    public static void main(String[] args) {
        ConexionFabrica fabrica = new ConexionFabrica();
        IConexion cx1 = fabrica.getConexion("Oracle");
        cx1.conectar();
        cx1.desconectar();

        IConexion cx2 = fabrica.getConexion("Mysql");
        cx2.conectar();
        cx2.desconectar();
    }
}
