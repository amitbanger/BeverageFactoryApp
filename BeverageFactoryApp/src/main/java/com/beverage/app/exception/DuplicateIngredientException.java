package com.beverage.app.exception;

public class DuplicateIngredientException extends RuntimeException {
    public DuplicateIngredientException(String errorMessage) {
        super(errorMessage);
    }
}
