/*
Напишите программу для нахождения второго по величине числа из массива.
 */

import java.util.Scanner;

public class Solution8 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
        System.out.println("Сгенерированный массив:");
        for (int i: arr) {
            System.out.print(i + " ");
        }
        int max = findMaxValue(arr);
        System.out.println("\nСамое большое число в массиве " + max);

        int secondMax = arr[findFirstNonmaxIndex(arr, max)];

        for (int i: arr) {
            if ((i > secondMax) && (i < max)) {
                secondMax = i;
            }
        }
        System.out.println("Второе по величине число в массиве " + secondMax);
        scan.close();
    }

    static int findMaxValue(int arr[]) {
        int max = arr[0];
        for (int i: arr) {
            if ( i > max) {
                max = i;
            }
        }
        return max;
    }
    static int findFirstNonmaxIndex(int arr[], int max) {
        /*
        Метод возвращает номер индекса первого элемента массива неравного максимальному значению в массиве,
        чтобы исключить присваивание переменной secondMax максимального значения
        */
        int k = 0;
        for (; k < arr.length; k++) {
            if (arr[k] < max) {
                break;
            }
        }
        return k;
    }
}