package _Inerhitance;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create a class called "Dog" that extends the Animal class.
     * <p>
     * Add a new field called "breed" to the Dog class.
     * <p>
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     * <p>
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        Dog fuffi = new Dog("Fuffi!",80, 25, "Pastore Tedesco");// Your code here
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     * <p>
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     * <p>
     * Also create constructors, getters and setters
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Fish nemo = new Fish("Fuffi",6.30, 1.50, "Pesce Pagliaccio");
        Bird uccellino = new Bird("Uccellino",4, 0.350, 9);// Your code here
    }


    /**
     * 3:
     * <p>
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     * <p>
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Dog fuffi = new Dog(  "Fuffi!",80, 25, "Pastore Tedesco");
        Fish nemo = new Fish("Nemo!",6.30, 1.50, "Pesce Pagliaccio");
        Bird uccellino = new Bird("Uccellino!",4, 0.350, 9);
        Map<Animal, Double> myMap = new HashMap<>();
        myMap.put(fuffi, fuffi.runSpeedMetersPerSecond());
        myMap.put(nemo, nemo.swimSpeedMetersPerSecond());
        myMap.put(uccellino, uccellino.flySpeedMetersPerSecond());

        Animal y = null;
        double x = 0;
        for (Map.Entry<Animal, Double> a : myMap.entrySet()){
            if (a.getValue() > x) {
                x = a.getValue();
                y = a.getKey();// Your code here
            }

        }
            System.out.println(y.name);
    }
}

