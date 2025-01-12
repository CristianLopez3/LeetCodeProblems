package com.cristian.leetcode.easy;

public class MergeSortedArray {

    /**
     * @Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * @Output: [1,2,2,3,5,6]
     * @Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
     *               The result of the merge is [1,2,2,3,5,6] with the underlined
     *               elements coming from nums1.
     *
     *               Make a solution with O(n + m) time complexity.
     * @Solution: use merge sort technique to do it, and how they both are already
     *            organized
     *            we can start from the end,
     */
    public static void main(String args[]) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int nums2[] = { 2, 4, 5 };
        int m = 3;
        int n = 3;

        printArray(nums1);
        System.out.println();
        new MergeSortedArray()
                .mergeSort(nums1, m, nums2, n);
        printArray(nums1);

    }

    public void mergeSort(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

    }

    static void printArray(int[] arr) {
        for (int arr2 : arr) {
            System.out.print(arr2 + " ");
        }
    }
}
