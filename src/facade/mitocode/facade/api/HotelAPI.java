package facade.mitocode.facade.api;

public class HotelAPI {
    public void buscarHoteles(String fechaEntrada, String fechaSalida, String origen, String destino){
        System.out.println("====================================================");
        System.out.println("Hoteles encontrados");
        System.out.printf("Entrada: %s\tSalida: %s", fechaEntrada, fechaSalida);
        System.out.println("Hotel A");
        System.out.println("Hotel B");
        System.out.println("Hotel C");
        System.out.println("====================================================");
    }
}
