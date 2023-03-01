package prototype.mitocode;

import prototype.mitocode.model.CuentaAHImplem;

public class App {
    public static void main(String[] args) {
        CuentaAHImplem cuentaAhorro = new CuentaAHImplem();
        cuentaAhorro.setMonto(200);
        CuentaAHImplem cuentaClonada = (CuentaAHImplem) cuentaAhorro.clonar();

        if(cuentaClonada != null){
            System.out.println(cuentaClonada);
        }

        System.out.println(cuentaClonada == cuentaAhorro);
    }
}
