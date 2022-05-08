package design_patterns.creational.strategy.example2;

import java.lang.reflect.ParameterizedType;

/**
 * created by ANEK on Monday 5/2/2022 at 6:48 PM
 */

public class PaymentByCreditCard implements PaymentStrategy {
    private CreditCard creditCard;
    @Override
    public void collectPaymentDetails() {
        creditCard = new CreditCard("Anek",12345L);
        System.out.println("Name is :: "+creditCard.getNameOnCard()+" and cardNumber is :: "+creditCard.getCardNumber());
    }

    @Override
    public void validatePaymentDetails() {
        System.out.println(this.getClass().getSimpleName()+" payment method is valid");
    }

    @Override
    public void pay(int amount) {
        System.out.println("amount has been paid :: "+amount);
    }
}
class CreditCard {
    String nameOnCard;
    Long cardNumber;

    public Long getCardNumber() {
        return cardNumber;
    }

    public CreditCard(String nameOnCard, Long cardNumber){
        this.nameOnCard = nameOnCard;
        this.cardNumber = cardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

}