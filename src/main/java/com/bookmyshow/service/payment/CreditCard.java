package com.bookmyshow.service.payment;

public class CreditCard implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using credit card.");
    }
}
