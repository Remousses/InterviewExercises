package com.remousses.interview.exercises.exercice.solid.solution;

interface BirdFlyable {
    default void fly() {
        System.out.println("I fly");
    }
}

abstract class Bird {
    public String eat() {
        return "I eat";
    }
    public String drink() {
        return "I drink";
    }
}

class Eagle extends Bird implements BirdFlyable {
    @Override
    public String eat() {
        return super.eat() + " meat";
    }
    @Override
    public String drink() {
        return super.drink() + " spring water";
    }
}

class Penguin extends Bird {
    @Override
    public String eat() {
        return super.eat() + " fish";
    }
    @Override
    public String drink() {
        return super.drink() + "sea water";
    }
}

class MainSolidSolution {
    public static void main(String[] args) {
        displayBird(new Eagle());
        displayBird(new Penguin());
    }
    public static void displayBird(Bird bird) {
        if (bird instanceof Eagle eagle) {
            eagle.fly();
        }
        System.out.println(bird.eat());
        System.out.println(bird.drink());
    }
}