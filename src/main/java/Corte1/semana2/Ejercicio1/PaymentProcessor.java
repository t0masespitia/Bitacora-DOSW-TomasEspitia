package Corte1.semana2.Ejercicio1;

public abstract class PaymentProcessor {

    public void processPayment(double amount){
        Payment payment = createPayment();
        payment.Pay(amount);
    }

    protected abstract Payment createPayment();

}