package com.cristian.problems.easy.tests;

public class testIndexOf {
    public static void main(String[] args) {
        String firstString = "Hi there, this is a test";
        String secondString = "this";

        /*
            the word to find is the parameter of indexOf
            In that case the function return de position in which it was located.
            Otherwise, it will  return -1 if it is not find
         */

        System.out.println(firstString.indexOf(secondString)); // return 10
        System.out.println(secondString.indexOf(firstString)); // return -1

        String[] names = {"cristian", "cristhoper", "crispy", "cristiano"};
        String cr = "cr";
        System.out.println(names[0].indexOf(cr));

    }
}
