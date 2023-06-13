package br.ecommerce.caesdaeliza.common.logistics;

public class ShippingSpecs {

    private final int transactionId;

    private ShippingMethod method;
    private String address;

    public ShippingSpecs(int transactionId, ShippingMethod method, String address) {
        this.transactionId = transactionId;
        this.method = method;
        this.address = address;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public ShippingMethod getMethod() {
        return method;
    }

    public void setMethod(ShippingMethod method) {
        this.method = method;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
