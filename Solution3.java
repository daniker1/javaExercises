/*
Напишите программу, чтобы поменять местами две переменные.
 */

import java.util.Scanner;

public class Solution3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение переменной m: ");
        double m = scan.nextDouble();
        System.out.println("Введите значение переменной n: ");
        double n = scan.nextDouble();
        double c = m;
        m = n;
        n = c;
        System.out.println("Теперь значение переменной m равно " + m);
        System.out.println("А значение переменной n равно " + n);
    }
}