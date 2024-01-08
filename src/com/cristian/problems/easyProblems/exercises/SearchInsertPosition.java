package com.cristian.problems.easyProblems.exercises;

public class SearchInsertPosition {

    /**
     * Given a sorted array of distinct integers and a target value, return
     * the index if the target is found. If not, return the index where
     * it would be if it were inserted in order.
     *
     * You must write an algorithm with O(log n) runtime complexity.
     */

    public static int searchInsert(int[] nums, int target){
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(target > nums[i]){
               index++;
            }
        }
        return index;
    }

    /**
     * Example 1:
     *
     * Input: nums = [1,3,5,6], target = 5
     * Output: 2
     */

}
