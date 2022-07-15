/*
Напишите программу для суммирования значений массива.
 */

import java.util.Scanner;

public class Solution7 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
        System.out.println("Сгенерированный массив:");
        int sum = 0;
        for (int i: arr) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nСумма всех элементов массива равна " + sum);
        scan.close();
    }
}