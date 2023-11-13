package com.cristian.problems.easy.exercises;


import java.util.Stack;

public class ValidParentheses {

    /**
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     *
     * An input string is valid if:
     *
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     * @param s
     * @return
     */
    public static Boolean isValid(String s){

        final char open = '(';
        final char close = ')';
        final char keyOpen = '{';
        final char keyClose = '}';
        final char bracketOpen = '[';
        final char bracketClose = ']';

        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == open || c == keyOpen || c == bracketOpen){
                stack.push(c);
            } else if(c == close){
                if(stack.isEmpty() || stack.pop() != open){
                    return false;
                }
            } else if(c == keyClose){
                if(stack.isEmpty() || stack.pop() != keyOpen){
                    return false;
                }
            } else if(c == bracketClose){
                if(stack.isEmpty() || stack.pop() != bracketOpen){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([{}])";
        System.out.println(isValid(s)); // true

        String c = "(";
        System.out.println(isValid(c)); // false
    }
}
