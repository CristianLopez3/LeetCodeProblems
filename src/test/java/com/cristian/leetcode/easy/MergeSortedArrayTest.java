package com.cristian.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {

    private MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    void testMergeSortedArraysCase1(){
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 4, 5};
        int m = 3;
        int n = 3;

        int result[] = {1, 2, 2, 3, 4, 5};

        mergeSortedArray.mergeSort(nums1, m, nums2, n);
        assertArrayEquals(nums1, result);
    }

    @Test
    void testMergeSortedArraysCase2(){
        int nums1[] = {0};
        int nums2[] = {1};
        int m = 0;
        int n = 1;

        int result[] = {1};

        mergeSortedArray.mergeSort(nums1, m, nums2, n);
        assertArrayEquals(nums1, result);
    }

}
