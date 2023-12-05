package org.example.Calculator;

public class Calculator {

    public static  <T extends Number,E extends Number> Number sum(T t, E e){
        return t.doubleValue() + e.doubleValue();
    }

    public static  <T extends Number,E extends Number> Number subtract(T t, E e){
        return t.doubleValue() - e.doubleValue();
    }

    public static <T extends Number, E extends Number> Number multiply(T t, E e) {
        return t.doubleValue() * e.doubleValue();
    }

    public static <T extends Number, E extends Number> Number divide(T t, E e) {
        return t.doubleValue() / e.doubleValue();
    }

}
