package com.aston.fatykhov.task1;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.UnsupportedEncodingException;

public class Main {
    public static int getIntegerInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = scanner.nextInt();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введите целое число!");
                scanner.next();
            }
        }
    }
    

      public static void compareNumbers(int a, int b) {
        System.out.print("Результат сравнения: ");
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }
  
     public static void performArithmetic(int a, int b) {
        System.out.println("\nАрифметические операции:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        
        if (b == 0) {
            System.out.println("a / b = Деление на ноль невозможно!");
        } else {
            System.out.println("a / b = " + ((double) a / b));
        }
    }

    public static void main(String[] args) {
         try {
            System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
   
        try (Scanner scanner = new Scanner(System.in)) {
   
            int a = getIntegerInput(scanner, "Введите первое целое число (a): " );
            int b = getIntegerInput(scanner, "Введите второе целое число (b): " );
            
            compareNumbers(a, b);
            performArithmetic(a, b);
        }
        catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
