package org.example;

public class Solution {

    /**
     * Calculates the length of the last word in the given string.
     *
     * @param s The string to analyze.
     * @return The length of the last word.
     */
    public int lengthOfLastWord(String s) {
        if (s.length() < 1) return 0;
        String[] temp = s.split("\s+");

        return temp[temp.length - 1].length();

    }
}


