package facade.mitocode.facade;

import facade.mitocode.facade.api.AvionAPI;
import facade.mitocode.facade.api.HotelAPI;

public class CheckFacade {
    private AvionAPI avionAPI;
    private HotelAPI hotelAPI;

    public CheckFacade(){
        avionAPI = new AvionAPI();
        hotelAPI = new HotelAPI();
    }

    public void buscar(String fechaIda, String fechaVuelta, String origen, String destino){
        avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
        hotelAPI.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
    }
}
