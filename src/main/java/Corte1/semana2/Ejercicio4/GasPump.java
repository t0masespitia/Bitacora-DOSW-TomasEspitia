package Corte1.semana2.Ejercicio4;

public class GasPump {
    private FuelService fuelService;

    public GasPump(FuelService fuelService){
        this.fuelService = fuelService;
    }

    public void supply(int liters){
        fuelService.supply(liters);
    }

}