package ru.otus.java.basic;

public class Randomness {
    /**
     * Generate random integer number
     *
     * @return Random integer number
     */
    public static int generateRandomInteger() {
        return (int) ((Math.random() - 0.5) * Math.pow(10, (int) (Math.random() * 10)));
    }

    /**
     * Generate random positive integer number
     *
     * @return Random integer number
     */
    public static int generateRandomPositiveInteger(int p) {
        return (int) ((Math.random()) * Math.pow(10, p));
    }

    /**
     * Generate random boolean
     *
     * @return Random boolean
     */
    public static boolean generateRandomBoolean() {
        return Math.random() < 0.5;
    }
}
