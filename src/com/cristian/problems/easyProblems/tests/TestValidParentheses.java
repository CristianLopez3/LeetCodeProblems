package com.cristian.easyProblems.exercises.tests;

import java.util.Stack;

public class TestValidParentheses {

        public static void main(String[] args) {
            Stack<Integer> numbers = new Stack<>();
            numbers.push(1);
            numbers.push(2);
            numbers.push(10);
            // numbers.forEach( number -> System.out.println(number));
            // numbers.pop();
            // numbers.forEach(number -> System.out.println(number));
            numbers.forEach(number -> System.out.println(number));

            if(numbers.pop() != 10){
                System.out.println( "hello, it's fine");
            }else{
                System.out.println("It's deleted");
            }

            numbers.forEach(number -> System.out.println(number));

            if(numbers.pop() != 1){
                System.out.println("hi there, it's fine too");
            }
            numbers.forEach(number -> System.out.println(number));



        }

}



