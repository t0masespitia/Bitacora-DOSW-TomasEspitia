package Corte1.semana3.Ejercicio1;

public abstract class PaymentProcessor {

    public void processPayment(double amount){
        Payment payment = createPayment();
        payment.Pay(amount);
    }

    protected abstract Payment createPayment();

}