package Corte1.semana2.Ejercicio1;

public class Main {
    public static void main(String[] args){
        PaymentProcessor processor;
        processor = new CreditCardProcessor();
        processor.processPayment(100);

        processor = new PaypalProcessor();
        processor.processPayment(250);

        processor = new BankTransferProcessor();
        processor.processPayment(500);

    }
}