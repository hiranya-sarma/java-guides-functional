package com.javaguides.functional;

import java.util.function.Function;

@FunctionalInterface
interface Shape {
    void draw();

    default void m1(Shape shape) {
        shape.draw();
    }
    default void m2(Shape shape) {
        shape.draw();
    }
}


public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        Function<Integer, Integer> square = x->x*x;
        System.out.println("square: "+square.apply(10));

        Shape circle = ()->System.out.println("drawing circle");
        circle.draw();
    }
}
