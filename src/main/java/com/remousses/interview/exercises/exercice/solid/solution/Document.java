package com.remousses.interview.exercises.exercice.solid.solution;

public class Document implements Printable {
    public String title;
    public String content;
    public Integer version;
}

interface Printable {
    default void print() {
        System.out.println("I print");
    }
}
