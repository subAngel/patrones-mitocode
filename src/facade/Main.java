package facade;

import facade.facade.CheckFacade;

public class Main {
    public static void main(String[] args) {
        CheckFacade cliente1 = new CheckFacade();
        cliente1.buscar("02/07/2023", "08/07/2023", "Mexico", "Oaxaca");

        CheckFacade cliente2 = new CheckFacade();
        cliente1.buscar("03/11/2023", "06/11/2023", "Mexico", "Oaxaca");

    }



}
