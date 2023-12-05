package org.example.Pair;

public class Main {
    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<>("df", 1);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }
}
