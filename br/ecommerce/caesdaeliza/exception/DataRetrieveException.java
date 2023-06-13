package br.ecommerce.caesdaeliza.exception;

public class DataRetrieveException extends Exception {
    
    public DataRetrieveException(String message) {
        super(message);
    }

    public DataRetrieveException(String message, Throwable cause) {
        super(message, cause);
    }
}
