package design_patterns.creational.strategy.example2;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * created by ANEK on Monday 5/2/2022 at 6:49 PM
 */

public class PaymentByPaypal implements PaymentStrategy{
    public final static Function<String,String> func = (String e) -> "paypal";
    @Override
    public void collectPaymentDetails() {
        String name = "xxx";
        String password = "...";
        System.out.println("Name is :: "+name+" and password is :: "+password);
    }

    @Override
    public void validatePaymentDetails() {
        System.out.println(this.getClass().getSimpleName()+" payment method is valid");

    }

    @Override
    public void pay(int amount) {
        System.out.println("Amount :: "+amount+" has been paid .");
    }
    
}
