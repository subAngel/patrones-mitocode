package abstract_factory.interfaz.implementacion;

import abstract_factory.interfaz.IConexionREST;

public class ConexionRestCompras implements IConexionREST {
    @Override
    public void leerURL(String url) {
        System.out.println("Conectandose a " + url);

    }
}
