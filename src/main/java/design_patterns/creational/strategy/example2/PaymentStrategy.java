package design_patterns.creational.strategy.example2;

/**
 * created by ANEK on Monday 5/2/2022 at 6:45 PM
 */

interface PaymentStrategy {
    void collectPaymentDetails();
    void validatePaymentDetails();
    void pay(int amount);
}
