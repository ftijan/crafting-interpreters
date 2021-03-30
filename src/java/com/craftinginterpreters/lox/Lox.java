package com.craftinginterpreters.lox;

import java.io.IOException;

public class Lox {
    public static void main(String[] args) throws IOException {
        if (args.length > 1) {
            System.out.println("Usage: jlox [script]");
            System.exit(64);
        } else if (args.length == 1) {
            throw new UnsupportedOperationException("Not yet implemented");
        } else {
            throw new UnsupportedOperationException("Not yet implemented");
        }
    }
}