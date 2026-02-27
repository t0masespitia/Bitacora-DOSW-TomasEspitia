package Corte1.semana3.Ejercicio1;

public class PaypalProcessor extends PaymentProcessor{
    @Override
    protected Payment createPayment() {
        return new Paypal();
    }
}
