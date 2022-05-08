package design_patterns.creational.strategy.example2;

/**
 * created by ANEK on Monday 5/2/2022 at 6:45 PM
 */

public class PaymentService {

    private PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void processOrder(int amount){

        paymentStrategy.collectPaymentDetails();
        paymentStrategy.validatePaymentDetails();
        paymentStrategy.pay(amount);
    }

}
