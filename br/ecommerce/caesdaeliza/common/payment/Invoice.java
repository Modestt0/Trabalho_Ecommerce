package br.ecommerce.caesdaeliza.common.payment;

/* Nota Fiscal */
public class Invoice {

    private final int id;
    private final int transactionId;

    public Invoice(int id, int transactionId) {
        this.id = id;
        this.transactionId = transactionId;
    }

    public int getId() {
        return id;
    }

    public int getTransactionId() {
        return transactionId;
    }
}
