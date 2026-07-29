package com.aston.fatykhov.task3;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        /*
         * System.out.println("Четные числа в массиве:");
         * Arrays.stream(numbers)
         * .filter(num -> num % 2 == 0)
         * .forEach(num -> System.out.print(num + " "));
         */

        System.out.println("Четные числа в массиве:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
