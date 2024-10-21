package ru.otus.java.basic;

public class App {
    public static void main(String[] args) {
        greetings();
        checkSign(generateRandomInteger(), generateRandomInteger(), generateRandomInteger());
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
     * Generate random integer number
     *
     * @return Random integer number
     */
    public static int generateRandomInteger() {
        return (int) ((Math.random() - 0.5) * Math.pow(10, (int) (Math.random() * 10)));
    }
}