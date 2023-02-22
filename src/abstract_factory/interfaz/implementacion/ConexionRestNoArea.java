package abstract_factory.interfaz.implementacion;

import abstract_factory.interfaz.IConexionREST;

public class ConexionRestNoArea implements IConexionREST {
    @Override
    public void leerURL(String url) {
        System.out.println("AREA NO ELEGIDA");
    }
}
