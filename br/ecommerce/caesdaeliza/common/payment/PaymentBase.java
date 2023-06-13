package br.ecommerce.caesdaeliza.common.payment;

import java.time.LocalDate;

public abstract class PaymentBase {

    protected LocalDate paymentDate;

    public PaymentBase() {}

    public boolean isPaid() {
        return paymentDate != null;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public abstract void processPayment();
}
