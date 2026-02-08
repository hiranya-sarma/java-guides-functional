package com.javaguides.functional;

import java.util.function.Function;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        Function<Integer, Integer> square = x->x*x;
        System.out.println("square: "+square.apply(10));
    }
}
