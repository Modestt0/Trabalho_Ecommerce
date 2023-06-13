package br.ecommerce.caesdaeliza.exception;

public class DataRegistryException extends Exception {

    public DataRegistryException(String message) {
        super(message);
    }

    public DataRegistryException(String message, Throwable cause) {
        super(message, cause);
    }
}
