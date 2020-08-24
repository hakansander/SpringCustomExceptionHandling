package com.hakansander.customExceptionHandling.exceptionHandling;

public class CurrencyFormatException extends RuntimeException {
    public CurrencyFormatException() {
        super();
    }

    public CurrencyFormatException(String message) {
        super(message);
    }

    public CurrencyFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public CurrencyFormatException(Throwable cause) {
        super(cause);
    }

    protected CurrencyFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
