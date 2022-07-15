/*
Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.

A subarray is a contiguous subsequence of the array.


Example 1:

Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58

Example 2:

Input: arr = [1,2]
Output: 3
Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.


Constraints:

    1 <= arr.length <= 100

 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class SumOfOddSubarrays {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int l;
        do {
            System.out.println("\nEnter array length (positive integer less than 100): ");
            while (!scan.hasNextInt()) {
                System.out.println("That not a number!");
                scan.next();
            }
            l = scan.nextInt();
        } while (l <= 0 || l >= 100);

        System.out.println("\nEnter array elements (positive integers only): ");
        int[] arr = new int[l];
        for (int i=0; i<l; i++) {
            arr[i] = Math.abs(scan.nextInt());
        }
        System.out.println("\nGiven array: " + Arrays.toString(arr));
        int sum = getSumOfOddSubarrays(arr);
        System.out.println("\nSum of all elements in odd subarrays: " + sum);
        scan.close();
    }

    static int getSumOfOddSubarrays(int[] arr) {
        int l = arr.length;
        ArrayList<int[]> subarraysList = new ArrayList<int[]>();
        int sum = 0;

        for (int i=l; i>0; i--) {
            switch (i % 2) {
                case 0:
                    break;
                case 1:
                    int times = (l-i)+1;
                    for (int j=0; j<times; j++) {
                        int[] subarr = Arrays.copyOfRange(arr, j, j+i);
                        for (int a: subarr) {
                            sum += a;
                        }
                        subarraysList.add(subarr);
                    }
                    break;
            }
        }

        System.out.println("\nAll odd subarrays: ");
        for (int[] x : subarraysList) {
            System.out.println(Arrays.toString(x));
        }

        return sum;
    }
}