package Corte1.semana2.Ejercicio1;

public class CreditCardProcessor extends PaymentProcessor{
    @Override
    protected Payment createPayment() {
        return new CreditCard();
    }
}