package com.destinxiao.execption;

public class IPFormatException extends RuntimeException {
    public IPFormatException() {
    }

    public IPFormatException(String message) {
        super(message);
    }

    public IPFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public IPFormatException(Throwable cause) {
        super(cause);
    }

    public IPFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
