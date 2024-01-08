package com.cristian.problems.easy.exercises;

public class Palindrome {

    public static boolean palindrome(int x){
        // negative numbers aren't palindrome
        if(x < 0) return false;
        String numberStr = String.valueOf(x);
        int left = 0;
        int right = numberStr.length() - 1;

        while(left < right) {
            if(numberStr.charAt(left) != numberStr.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrome(123));
    }

}
