package com.epam.geometry.exception;


public class TriangleCreateException extends Exception{
    public TriangleCreateException() {
    }

    public TriangleCreateException(String message) {
        super(message);
    }

    public TriangleCreateException(String message, Throwable cause) {
        super(message, cause);
    }

    public TriangleCreateException(Throwable cause) {
        super(cause);
    }

    public TriangleCreateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
