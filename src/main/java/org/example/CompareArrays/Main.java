package org.example.CompareArrays;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {

        Object[] objectsOne = {1,"123", "qwerty"};
        Object[] objectsTwo = {1,"123", "qwerty"};

        System.out.println(CompareArrays(objectsOne,objectsTwo));
    }
    public static <T> boolean CompareArrays(T[] a, T[] b) {
        return Arrays.equals(a,b);
    }
}
