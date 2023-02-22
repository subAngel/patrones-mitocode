package abstract_factory;

import abstract_factory.interfaz.FabricaAbstracta;
import abstract_factory.interfaz.IConexionDB;
import abstract_factory.interfaz.IConexionREST;
import abstract_factory.interfaz.implementacion.ConexionRestCompras;
import abstract_factory.interfaz.implementacion.ConexionRestNoArea;
import abstract_factory.interfaz.implementacion.ConexionRestVentas;

public class ConexionRestFabrica implements FabricaAbstracta {

    @Override
    public IConexionDB getBD(String motor) {
        return null;
    }

    @Override
    public IConexionREST getREST(String area) {
        if(area==null){
            return new ConexionRestNoArea();
        } else if (area.equalsIgnoreCase("COMPRAS")) {
            return new ConexionRestCompras();
        } else if(area.equalsIgnoreCase("VENTAS")){
            return new ConexionRestVentas();
        }
        return new ConexionRestNoArea();
    }
}
