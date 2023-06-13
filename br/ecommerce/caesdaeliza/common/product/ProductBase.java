package br.ecommerce.caesdaeliza.common.product;

public abstract class ProductBase {

    private final int id;
    private boolean isReserved;

    public ProductBase(int id) {
        this.id = id;
        this.isReserved = false;
    }

    public int getId() {
        return id;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }
}
