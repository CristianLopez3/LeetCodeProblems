package com.cristian.problems.general;

import java.util.Random;

public class MergeSort {
    
    /**
     * Giving an unordered array {10, 23, 1, 5, 28, 22, 7}.
     * The goal is divide and conquer this array 
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[9];
        
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
        System.out.print("Before: ");
        printArray(array);
        mergeSort(array);
        System.out.print("After: ");
        printArray(array);
    }



    static void mergeSort(int[] array) {

        int length = array.length;

        // base case for recursion
        if(length < 2) {
            return;
        }

        int mid = length / 2;

        int leftHalf[] = new int[mid];
        int rightHalf[] = new int[length - mid];

        //populate left lenght
        for(int i = 0; i < mid; i++)
            leftHalf[i] = array[i];
        
        // populate right left
        for(int i = mid; i < length; i++)
            rightHalf[i - mid] = array[i]; // i - mid to start from zero.

        // recursively divide
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // merge
        merge(array, leftHalf, rightHalf);
    }

    static void merge(int[] originalArray, int[] leftHalf, int[] rightHalf){
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;

        int leftCounter = 0;
        int rightCounter = 0;
        int originalCounter = 0;

        while((leftCounter < leftLength) && (rightCounter < rightLength)){
            if(leftHalf[leftCounter] < rightHalf[rightCounter]){
                originalArray[originalCounter] = leftHalf[leftCounter];
                leftCounter++;
            } else {
                originalArray[originalCounter] = rightHalf[rightCounter];
                rightCounter++;
            }
            originalCounter++;
        }

        // sort the remaining values for left
        while(leftCounter < leftLength) {
            originalArray[originalCounter] = leftHalf[leftCounter];
            leftCounter++;
            originalCounter++;
        }

        // sort the remaining values for left
        while(rightCounter < rightLength) {
            originalArray[originalCounter] = rightHalf[rightCounter];
            rightCounter++;
            originalCounter++;
        }

    }


    static void printArray(int[] array){
        StringBuilder builder = new StringBuilder();
        for(int x : array){
            builder.append(x + ", ");
        }
        System.out.println(builder.toString());
    }

}