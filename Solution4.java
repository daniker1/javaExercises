/*
Напишите программу, которая принимает от пользователя три числа и выводит наибольшее из них.
 */

import java.util.Scanner;

public class Solution4 {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 3 числа: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double max = a;
        if (b>=a & b>=c) {
            max = b;
        }
        else if (c>=a & c>=b) {
            max = c;
        }
        System.out.println("Наибольшее число " + max);
    }

}