package com.bookmyshow.service.payment;

public class UPIPayments implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("Paid " + amount+ " using UPI Payments");
    }
}
