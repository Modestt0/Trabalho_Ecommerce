package br.ecommerce.caesdaeliza.common.payment.impl;

import br.ecommerce.caesdaeliza.common.payment.PaymentBase;

import java.time.LocalDate;

public class CreditCard extends PaymentBase {

    private final int installments;

    public CreditCard(int installments) {
        this.installments = installments;
        this.paymentDate = null;
    }

    public int getInstallments() {
        return installments;
    }

    @Override
    public void processPayment() {
        this.paymentDate = LocalDate.now();
        System.out.println("Pagamento processado com cartão!");
    }
}
