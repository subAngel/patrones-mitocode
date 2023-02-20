package factory.interfaz.implem;

import factory.interfaz.IConexion;

public class ConexionVacia implements IConexion {

    @Override
    public void conectar() {
        System.out.println("NO SE ESPECIFICO EL PROVEEDOR");
    }

    @Override
    public void desconectar() {
        System.out.println("NO SE ESPECIFICO EL PROVEEDOR");
    }
}
