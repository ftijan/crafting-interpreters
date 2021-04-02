package com.craftinginterpreters.lox;

public class ReturnValue extends RuntimeException {    
    private static final long serialVersionUID = 7623690543297990178L;
    public final Object value;

    public ReturnValue(Object value) {
        super(null, null, false, false);
        this.value = value;
    }    
}
