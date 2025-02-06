package bookMyShow.demo.service.payment;

public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        if(paymentStrategy != null) {
            paymentStrategy.pay((int) Math.round(amount));
        }
    }
}