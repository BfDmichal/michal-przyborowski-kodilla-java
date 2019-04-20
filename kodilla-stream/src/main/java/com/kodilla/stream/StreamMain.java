package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Group", (string) -> string + "A");
        poemBeautifier.beautify("oslo", (string) -> string.toUpperCase());
        poemBeautifier.beautify("culture", (string) -> "CBA" + string);
        poemBeautifier.beautify("  Convert simple  ", (a) -> a.trim());
        poemBeautifier.beautify("DEF", (string) -> "ABC" + string);
        poemBeautifier.beautify("XYZ", (string) -> string + "ABC");

        System.out.println("Using stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
