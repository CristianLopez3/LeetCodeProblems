package com.cristian.problems.easyProblems.tests;

import com.cristian.problems.easyProblems.exercises.RemoveElement;


public class RemoveElementTest {
    public static void main(String[] args){
        int nums[] = {0,1,2,2,3,0,4,2};
        int valueToRemove = 2;

        for(int el: nums){
            System.out.println(el);
        }

        System.out.println("Method Remove Element");
        RemoveElement.removeElement(nums, valueToRemove);

        for(int el: nums){
            System.out.println(el);
        }


    }
}
