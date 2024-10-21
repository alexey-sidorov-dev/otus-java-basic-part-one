package ru.otus.java.basic;

public class App {
    public static void main(String[] args) {
        greetings();
    }

    /**
     * Print words in one column
     */
    private static void greetings(){
        String[] words = {"Hello","World","from","Java"};
        for (String word:words) {
            System.out.println(word);
        }
    }
}