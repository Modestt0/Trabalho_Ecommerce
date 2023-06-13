package br.ecommerce.caesdaeliza.common.payment.impl;

import br.ecommerce.caesdaeliza.common.payment.PaymentBase;

import java.time.LocalDate;

public class Cash extends PaymentBase {

    public Cash() {
        this.paymentDate = null;
    }

    @Override
    public void processPayment() {
        this.paymentDate = LocalDate.now();
        System.out.println("Pagamento processado com dinheiro!");
    }
}
