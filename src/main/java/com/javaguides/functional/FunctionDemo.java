package com.javaguides.functional;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String input) {
                return input;
            }
        };

        Function<String, String> function1 = (String input) -> input.toUpperCase();

        System.out.println(function1.apply("hello").toLowerCase());
    }
}
