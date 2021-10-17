package ru.ivlasov.spring.rest.exceptionHandlers;

public class NoSuchEmployeeException extends RuntimeException {
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
