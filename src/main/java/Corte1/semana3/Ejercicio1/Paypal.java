package Corte1.semana3.Ejercicio1;

public class Paypal implements Payment{
    @Override
    public void Pay(double amount) {
        System.out.println("Paypal por el monto de: " + amount);
    }
}