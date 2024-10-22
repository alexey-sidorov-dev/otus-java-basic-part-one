package ru.otus.java.basic;

public class App {
    public static void main(String[] args) {
        greetings();
        checkSign(generateRandomInteger(), generateRandomInteger(), generateRandomInteger());
        selectColor(generateRandomPositiveInteger(2));
        compareNumbers();
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
     * Chek sing for sum of three numbers
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

    public static void compareNumbers() {
        int a = generateRandomInteger();
        int b = generateRandomInteger();

        System.out.println(a >= b ? "a >= b" : "a < b");
    }
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
}