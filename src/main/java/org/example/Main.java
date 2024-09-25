package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number >= 100 && number <= 999) {
                int sum = 0;


                sum += number / 100;
                sum += (number / 10) % 10;
                sum += number % 10;

                System.out.println("Сумма цифр числа " + number + " равна " + sum + ".");
            } else {
                System.out.println("Ошибка: пожалуйста, введите корректное трехзначное число.");
            }
        } else {
            System.out.println("Ошибка: пожалуйста, введите корректное трехзначное число.");
        }

        scanner.close();
    }
}