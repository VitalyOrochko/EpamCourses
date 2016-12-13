package com.epam.geometry.exception;


public class PointCreateException extends Exception {
    public PointCreateException() {
    }

    public PointCreateException(String message) {
        super(message);
    }

    public PointCreateException(String message, Throwable cause) {
        super(message, cause);
    }

    public PointCreateException(Throwable cause) {
        super(cause);
    }

    public PointCreateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
