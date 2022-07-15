/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]


Constraints:

    The number of nodes in each linked list is in the range [1, 100].
    0 <= Node.val <= 9
    It is guaranteed that the list represents a number that does not have leading zeros.

 */

import java.util.Scanner;
import java.util.ArrayList;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l1;
        do {
            System.out.println("Enter the digit capacity of the number (positive integer): ");
            while (!scan.hasNextInt()) {
                System.out.println("That's not a number!");
                scan.next();
            }
            l1 = scan.nextInt();
        } while(l1 < 1 || l1 > 100);

        System.out.println("Enter the digits of the number in reverse order one by one");
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i=0; i<l1; i++) {
            int tempElement;
            do {
                while (!scan.hasNextInt()) {
                    System.out.println("That's not a number!");
                    scan.next();
                }
                tempElement = scan.nextInt();
            } while(tempElement < 0 || tempElement > 9);
            list1.add(tempElement);
        }

        int l2;
        do {
            System.out.println("Enter the digit capacity of the second number (positive integer): ");
            while (!scan.hasNextInt()) {
                System.out.println("That's not a number!");
                scan.next();
            }
            l2 = scan.nextInt();
        } while(l2 < 1 || l2 > 100);

        System.out.println("Enter the digits of the second number in reverse order one by one");
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i=0; i<l2; i++) {
            int tempElement;
            do {
                while (!scan.hasNextInt()) {
                    System.out.println("That's not a number!");
                    scan.next();
                }
                tempElement = scan.nextInt();
            } while(tempElement < 0 || tempElement > 9);
            list2.add(tempElement);
        }

        System.out.println("\nlist 1: ");
        for (int i: list1) {
            System.out.print(i + " ");
        }

        System.out.println("\nlist 2: ");
        for (int i: list2) {
            System.out.print(i + " ");
        }
        ArrayList<Integer> sumList = getSumOfNumbers(list1, list2);
        System.out.println("\nSum List: ");
        for (int i: sumList) {
            System.out.print(i + " ");
        }
        scan.close();
    }

    static ArrayList<Integer> getSumOfNumbers(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int numb1 = 0;
        int numb2 = 0;
        for (int i=0; i < list1.size(); i++) {
            numb1 += list1.get(i)*Math.pow(10, i);
        }
        for (int i=0; i < list2.size(); i++) {
            numb2 += list2.get(i)*Math.pow(10, i);
        }
        int sum = numb1 + numb2;
        ArrayList<Integer> sumList = new ArrayList<Integer>();
        do{
            sumList.add(sum % 10);
            sum /= 10;
        } while (sum > 0);
        return sumList;
    }
}