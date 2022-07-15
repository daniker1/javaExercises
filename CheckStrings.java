/*
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

Example:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.

 */

import java.util.Scanner;

public class CheckStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input first array length:");
        int l1 = scan.nextInt();
        System.out.println("Input first array elements:");
        String[] word1 = new String[l1];
        for (int i = 0; i < l1; i++) {
            word1[i] = scan.next();
        }

        System.out.println("Input second array length:");
        int l2 = scan.nextInt();
        System.out.println("Input second array elements:");
        String[] word2 = new String[l2];
        for (int i = 0; i < l2; i++) {
            word2[i] = scan.next();
        }
        boolean answer = stringArrsEquivalent(word1, word2);
        System.out.println("Two String Arrays are Equivalent: " + answer);
        scan.close();
    }

    static boolean stringArrsEquivalent(String[] a, String[] b) {
        String w1 = "";
        String w2 = "";
        for (String s: a) {
            w1 = w1 + s;
        }
        for (String s: b) {
            w2 = w2 + s;
        }
        if (w1.equals(w2)) {
            return true;
        }
        else {
            return false;
        }
    }
}