/*
Given an integer num, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

Example:

Input: num = 14
Output: 6
Explanation:
Step 1) 14 is even; divide by 2 and obtain 7.
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3.
Step 4) 3 is odd; subtract 1 and obtain 2.
Step 5) 2 is even; divide by 2 and obtain 1.
Step 6) 1 is odd; subtract 1 and obtain 0.

 */

import java.util.Scanner;

public class NumberOfSteps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number:");
        int a = scan.nextInt();
        int k = getNumberOfSteps(a);
        System.out.println("Number of steps to reduce a number to zero: " + k);
        scan.close();
    }
    static int getNumberOfSteps(int a) {
        int k = 0;
        while (a > 0) {
            switch (a % 2) {
                case 0:
                    a = a / 2;
                    break;
                case 1:
                    a = a - 1;
                    break;
            }
            k++;
        }
        return k;
    }
}