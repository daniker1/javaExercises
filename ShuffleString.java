/*
You are given a string s and an integer array indices of the same length.
The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.

Example:
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

 */
import java.util.Scanner;

class ShuffleString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.nextLine();
        int[] indicies = new int[word.length()];
        System.out.printf("Print %d numbers \n", indicies.length);
        for (int i = 0; i < indicies.length; i++){
            indicies[i] = scan.nextInt();
        }
        String newWord = restoreString(word, indicies);
        System.out.println("Shuffled word:   " + newWord);
        scan.close();
    }

    static String restoreString(String s, int[] indicies) {
        char[] sArr = s.toCharArray();
        char[] newArr = new char[sArr.length];
        for (int i = 0; i < indicies.length; i++) {
            newArr[indicies[i]] = sArr[i];
        }
        String newS = new String(newArr);
        return newS;
    }
}