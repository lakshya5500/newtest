package com.ecom.api.exception;

public class CartItemNotExistException extends IllegalArgumentException {
    public CartItemNotExistException(String msg) {
        super(msg);
    }
}
