package com.cristian.easyProblems.exercises;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
public class SolutionTwoSum{

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     * @param numbers
     * @param target
     * @return
     * @throws IndexOutOfBoundsException
     */
    public static int[] twoSum(int[] numbers, int target) throws IndexOutOfBoundsException {

        // Hacemos un hash map para almacenar la clave y el valor y de esta forma poder retornar
        // un array de enteros partiendo de esto.
       Map<Integer,Integer> index = new HashMap<>();
        for (int i = 0; i < numbers.length-1; i++) {
            int complement = target - numbers[i];
            if(index.containsKey(complement))
                return new int[] {(index.get(complement)), i};
            index.put(complement, i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] array = {2, 8, 5, 7};
        System.out.println(Arrays.toString(SolutionTwoSum.twoSum(array, 10)));;
    }

}