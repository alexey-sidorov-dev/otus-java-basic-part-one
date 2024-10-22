package ru.otus.java.basic;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] methods = {"greetings", "checkSign", "selectColor", "compareNumbers", "addOrSubtractAndPrint"};
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите номер метода для его выполнения:");
        printMethods(methods);
        while (number <= 0 || number > methods.length) {
            number = scanner.nextInt();
            System.out.println(number <= 0 || number > methods.length ? "Метода с таким номером не существует, повторите ввод:" : "Выбран метод: " + methods[number - 1]);
        }

        if (number == 1) {
            greetings();

        }
        if (number == 2) {
            checkSign(Randomness.generateRandomInteger(), Randomness.generateRandomInteger(), Randomness.generateRandomInteger());

        }
        if (number == 3) {
            selectColor(Randomness.generateRandomPositiveInteger(2));

        }
        if (number == 4) {
            compareNumbers();

        }
        if (number == 5) {
            addOrSubtractAndPrint(Randomness.generateRandomInteger(), Randomness.generateRandomInteger(), Randomness.generateRandomBoolean());

        }
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

    /**
     * Print methods
     *
     * @param methods Array of available methods
     */
    public static void printMethods(String[] methods) {
        for (int i = 0; i < methods.length; i++) {
            System.out.println((i + 1) + ": " + methods[i]);
        }
    }
}