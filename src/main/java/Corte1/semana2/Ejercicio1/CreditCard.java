package Corte1.semana2.Ejercicio1;

public class CreditCard implements Payment {
    @Override
    public void Pay(double amount){
        System.out.println("Pago con tarjeta de credito de: " + amount);
    }
}