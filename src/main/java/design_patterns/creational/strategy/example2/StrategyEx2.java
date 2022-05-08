package design_patterns.creational.strategy.example2;

/**
 * created by ANEK on Monday 5/2/2022 at 6:35 PM
 */

public class StrategyEx2 {
    public static void main(String[] args) {

        PaymentStrategy paymentByPaypalStrategy = new PaymentByPaypal();
        PaymentStrategy paymentByCreditStrategy = new PaymentByCreditCard();
        System.out.println("Payment by paypal ...");

        PaymentService service = new PaymentService(paymentByPaypalStrategy);
        service.processOrder(100);
        System.out.println("\n");

        System.out.println("Payment by credit card  ...");
        PaymentService service2 = new PaymentService(paymentByCreditStrategy);
        service2.processOrder(1000);
        System.out.println("\n");



        


        System.out.println("Process finished ...");




    }
}

