package prototype.mitocode.model;

import prototype.mitocode.interfaz.ICuenta;

public class CuentaAHImplem implements ICuenta {
    private String tipo;
    private double monto;

    public CuentaAHImplem(){
        tipo = "Ahorro";
    }

    @Override
    public ICuenta clonar(){
        CuentaAHImplem cuenta = null;
        try{
            cuenta = (CuentaAHImplem) clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return cuenta;
    }

    @Override
    public String toString() {
        return "CuentaAH [tipo=" + tipo + ", monto="+ monto +"]";
    }

    public void setMonto(double monto){
        this.monto = monto;
    }

    public double getMonto(){
        return monto;
    }
}
