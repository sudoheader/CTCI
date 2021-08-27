package com.sudoheader.problems;

public class SolutionRunner {
    public static void main(String[] args) {
        String unique = "uncopyrightable"; // longest word without duplicate characters
        String palindrome = "racecar";
        System.out.println(IsUnique.isUniqueChars(unique)); // should return true
        System.out.println(IsUnique.isUniqueChars(palindrome)); // should return false

        // with bit vector
        System.out.println(IsUnique.isUniqueCharsBitVector(unique)); // should return true
        System.out.println(IsUnique.isUniqueCharsBitVector(palindrome)); // should return true

        System.out.println(CheckPermutation.permutation("abcd", "dcba"));
        System.out.println(IdenticalCharacterCount.permutation("abcd", "dcba"));

        String str = "Mr John Smith    ";
        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
//        char[] ch = {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' ' };

        System.out.println(URLify.replaceSpaces(ch, 13));
    }
}