package org.example.Pair;

public class Pair <T,E> {
    private final T t;
    private final E e;

    public Pair(T t, E e) {
        this.t = t;
        this.e = e;
    }

    public T getFirst() {
        return t;
    }

    public E getSecond() {
        return e;
    }

    @Override
    public String toString() {
        return t + " " + e;
    }
}
