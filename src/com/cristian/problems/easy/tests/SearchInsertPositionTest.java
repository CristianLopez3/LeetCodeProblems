package com.cristian.problems.easy.tests;

import com.cristian.problems.easy.exercises.SearchInsertPosition;

public class SearchInsertPositionTest {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        int target = 5;
        int index = SearchInsertPosition.searchInsert(nums, target);
        System.out.println("The target is find in the index: " + index);
    }
}
