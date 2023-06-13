package br.ecommerce.caesdaeliza.common.transaction;

import br.ecommerce.caesdaeliza.common.payment.PaymentBase;
import br.ecommerce.caesdaeliza.common.payment.PaymentType;

import java.time.LocalDate;

public class Transaction {

    private final int id;
    private final int clientId;
    private float value;
    private PaymentBase paymentData;
    private PaymentType paymentType;
    private boolean isPaid;

    public Transaction(int id, int clientId, float value, PaymentBase paymentData, PaymentType paymentType) {
        this.id = id;
        this.clientId = clientId;
        this.value = value;
        this.paymentData = paymentData;
        this.paymentType = paymentType;
        this.isPaid = false;
    }

    public int getId() {
        return id;
    }

    public int getClientId() {
        return clientId;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public PaymentBase getPaymentData() {
        return paymentData;
    }

    public void setPaymentData(PaymentBase paymentData) {
        this.paymentData = paymentData;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public LocalDate getPaymentDate() {
        return paymentData.getPaymentDate();
    }
}
