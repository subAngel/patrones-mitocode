package facade.api;

public class AvionAPI {
    public void buscarVuelos(String fechaIda, String fechaVuelta, String origen, String destino){
        System.out.println("=================================");
        System.out.printf("Vuelos encotrados para %s desde %s\n", destino, origen);
        System.out.printf("Fecha Ida: %s\tFecha Vuelta: %s\n", fechaIda, fechaVuelta);
        System.out.println("=================================");
    }
}
