package com.kodilla.stream;

import com.kodilla.stream.beautifier.*;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Sky is blue", (str) -> str.toUpperCase());
        poemBeautifier.beautify("Sky is blue", (str) -> "ABC" + str + "ABC");
        poemBeautifier.beautify("Sky is blue", (str) -> str.concat(str));
        poemBeautifier.beautify("Sky is blue", (str) -> str.replaceAll("S", "T"));

    }
}