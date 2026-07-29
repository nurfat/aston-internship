package com.aston.fatykhov.task2;

import java.util.Scanner;

public class Main {
    /*
     * 
     * public static boolean compareStrings(String a, String b) {
     * return a.equals(b);
     * }
     */

    public static boolean compareStrings(String a, String b) {
        if (a == null && b == null) {
            return true;
        }

        if (a == null || b == null) {
            return false;
        }

        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку (a):");
        String a = scanner.nextLine();

        System.out.println("Введите вторую строку (b):");
        String b = scanner.nextLine();

        if (compareStrings(a, b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        scanner.close();
    }
}
