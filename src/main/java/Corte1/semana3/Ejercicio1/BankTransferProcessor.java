package Corte1.semana3.Ejercicio1;

public class BankTransferProcessor extends PaymentProcessor {
    @Override
    protected Payment createPayment() {
        return new BankTransfer();
    }
}