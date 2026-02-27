package Corte1.semana2.Ejercicio1;

public class PaypalProcessor extends PaymentProcessor{
    @Override
    protected Payment createPayment() {
        return new Paypal();
    }
}
