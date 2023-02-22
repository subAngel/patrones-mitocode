package abstract_factory.interfaz.implementacion;

import abstract_factory.interfaz.IConexionDB;
import factory.interfaz.IConexion;

public class ConexionVacia implements IConexionDB {

    @Override
    public void conectar() {
        System.out.println("NO SE ESPECIFICO EL PROVEEDOR");
    }

    @Override
    public void desconectar() {
        System.out.println("NO SE ESPECIFICO EL PROVEEDOR");
    }
}
