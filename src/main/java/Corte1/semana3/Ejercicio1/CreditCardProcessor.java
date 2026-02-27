package Corte1.semana3.Ejercicio1;

public class CreditCardProcessor extends PaymentProcessor{
    @Override
    protected Payment createPayment() {
        return new CreditCard();
    }
}