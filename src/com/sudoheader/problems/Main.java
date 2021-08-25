package com.sudoheader.problems;

public class Main {
    public static void main(String[] args) {
        String unique = "uncopyrightable"; // longest word without duplicate characters
        String palindrome = "racecar";
        System.out.println(IsUnique.isUniqueChars(unique)); // should return true
        System.out.println(IsUnique.isUniqueChars(palindrome)); // should return false

        // with bit vector
        System.out.println(IsUnique.isUniqueCharsBitVector(unique)); // should return true
        System.out.println(IsUnique.isUniqueCharsBitVector(palindrome)); // should return true
    }
}