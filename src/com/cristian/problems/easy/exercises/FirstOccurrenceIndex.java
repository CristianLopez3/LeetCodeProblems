package com.cristian.problems.easy.exercises;

public class FirstOccurrenceIndex {

    /**
     * Given two strings needle and haystack, return the index of the first occurrence
     * of needle in haystack, or -1 if needle is not part of haystack.
     */

    public static int strStr(String haystack, String needle){


        int haystackLength = haystack.length();
        int needleLength = needle.length();

        if(haystackLength < needleLength)
            return -1;

        for(int i = 0; i <= haystackLength - needleLength; i++){
            int j = 0;
            while(j < needleLength && haystack.charAt(i + j) == needle.charAt(j)){
                j++;
            }

            if(j == needleLength){
                return i;
            }

        }

        return -1;

    }

    /**
     * Example 1:
     *
     * Input: haystack = "sadbutsad", needle = "sad"
     * Output: 0
     * Explanation: "sad" occurs at index 0 and 6.
     * The first occurrence is at index 0, so we return 0.
     */



}
