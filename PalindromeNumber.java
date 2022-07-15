/*
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

    For example, 121 is a palindrome while 123 is not.

*/
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = scan.nextInt();
        boolean answer = isPalindrome(x);
        System.out.println("Number is palindrome: " + answer);
        scan.close();
    }
    static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] arr = s.toCharArray();
        boolean palindrome = true;
        int m = arr.length / 2;
        if (arr.length % 2 == 1) {
            for (int i = m; i < arr.length; i++) {
                int d = i - m;
                if (arr[i] != arr[m - d]) {
                    palindrome = false;
                    break;
                }
            }
        }
        else {
            for (int i = m - 1; i >= 0; i--) {
                if (arr[i] != arr[m]) {
                    palindrome = false;
                    break;
                }
                else {
                    m++;
                }
            }
        }
        return palindrome;
    }
}