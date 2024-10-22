package ru.otus.java.basic;

public class App {
    public static void main(String[] args) {
        greetings();
        checkSign(Randomness.generateRandomInteger(), Randomness.generateRandomInteger(), Randomness.generateRandomInteger());
        selectColor(Randomness.generateRandomPositiveInteger(2));
        compareNumbers();
        addOrSubtractAndPrint(Randomness.generateRandomInteger(), Randomness.generateRandomInteger(), Randomness.generateRandomBoolean());
    }

    /**
     * Print words in one column
     */
    private static void greetings() {
        String[] words = {"Hello", "World", "from", "Java"};
        for (String word : words) {
            System.out.println(word);
        }
    }

    /**
     * Check sing for sum of three numbers
     *
     * @param a First number
     * @param b Second number
     * @param c Third number
     */
    public static void checkSign(int a, int b, int c) {
        System.out.println(a + b + c > 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    /**
     * Select color
     *
     * @param data Initial number
     */
    public static void selectColor(int data) {
        String message = "Красный";

        if (data >= 10 && data <= 20) {
            message = "Желтый";
        }
        if (data >= 20) {
            message = "Зеленый";
        }

        System.out.println(message);
    }

    /**
     * Compare two integer numbers
     */
    public static void compareNumbers() {
        int a = Randomness.generateRandomInteger();
        int b = Randomness.generateRandomInteger();

        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    /**
     * Add or subtract delta from initial value
     *
     * @param initValue Initial value
     * @param delta     Provided delta
     * @param increment Operation flag
     */
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        System.out.println(increment ? initValue + delta : initValue - delta);
    }
}