package main.java.com.rudkin.examplesofexeptions;

import java.util.Arrays;

import static main.java.com.rudkin.examplesofexeptions.ExamplesOfExceptions.*;


public class Main {
    public static void main(String[] args) throws Throwable {

        System.out.println("firstEx result: " + sqr(5));

        System.out.println("secondEx result: " + area(5, 2));

        System.err.println("#1.in");
        f();
        System.err.println("#1.out");

        System.err.println(f1());

        ex1();

        ex2();

        ex3();

    }
}
