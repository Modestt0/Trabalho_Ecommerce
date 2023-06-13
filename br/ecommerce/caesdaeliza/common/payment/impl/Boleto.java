package br.ecommerce.caesdaeliza.common.payment.impl;

import br.ecommerce.caesdaeliza.common.payment.PaymentBase;

import java.time.LocalDate;

public class Boleto extends PaymentBase {

    private final LocalDate dueDate;

    public Boleto(LocalDate dueDate) {
        this.dueDate = dueDate;
        this.paymentDate = null;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    @Override
    public void processPayment() {
        this.paymentDate = LocalDate.now();
        System.out.println("Pagamento processado com boleto!");
    }
}
