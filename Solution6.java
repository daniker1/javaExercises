/*
Напишите программу для замены всех символов 'a' на символы 'b'.
 */

import java.util.Scanner;

public class Solution6 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = scan.nextLine();
        System.out.println(s.replace('a', 'b'));
    }
}