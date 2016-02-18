package com.github.sandokandias.exception;

public class BadCredentialException extends Exception {

    private static final long serialVersionUID = 4015723073391196155L;

    public BadCredentialException() {
    }

    public BadCredentialException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public BadCredentialException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadCredentialException(String message) {
        super(message);
    }

    public BadCredentialException(Throwable cause) {
        super(cause);
    }


}
