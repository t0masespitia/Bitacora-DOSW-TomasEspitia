package Corte1.semana2.Ejercicio1;

public class BankTransfer implements Payment{
    public void Pay(double amount){
        System.out.println("Transferencia por el monto de: " + amount);
    }
}