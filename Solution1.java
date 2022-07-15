/*
Напишите программу для вывода суммы, умножения, вычитания, деления и остатка двух чисел.
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два целых числа: ");
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();
        System.out.println("Сумма равна " + (number1 + number2));
        System.out.println("Разность равна " + (number1 - number2));
        System.out.println("Произведение равно " + (number1 * number2));
        System.out.println("Частное равно " + (number1 / number2));
        System.out.println("Остаток от деления равен " + (number1 % number2));
    }
}