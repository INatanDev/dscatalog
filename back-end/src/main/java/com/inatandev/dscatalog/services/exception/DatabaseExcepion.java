package com.inatandev.dscatalog.services.exception;

public class DatabaseExcepion extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DatabaseExcepion(String message) {
        super(message);
    }
}