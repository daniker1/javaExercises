/*
Напишите программу для проверки того, является ли число положительным или отрицательным.
 */

import java.util.Scanner;

public class Solution5 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scan.nextInt();
        String[] responses = {"Positive", "Negative"};
        System.out.println(responses[(a >> 31) & 1]);

        Solution5 obj = new Solution5();
        int m = obj.binary(a);
        System.out.format("%08d\n", m);
        Solution5 obj2 = new Solution5();
        int s = a >> 31;
        System.out.println("After shift " + s);
        s = obj2.binary(s);
        System.out.println("After shift " + s);
    }

    public static int binary(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        else if (n == 0) {
            return 0;
        }
        return binary(n / 2) * 10 + n % 2;
    }
}