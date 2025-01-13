package com.cristian.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    /**
     * Given an array of elements find the majority number
     * The majority number will always be greather than n / 2 where n is the array length.
     * You must return the majority number.
     * @time_complexity: O(n)
     * @param args
     */

    public static void main(String[] args) {
            int nums[] = {2,2,1,1,1,2,2};
            int result = majorityElement(nums);
        System.out.println(result);
    }

    static int majorityElement(int[] nums){
        Map<Integer, Integer> values = new HashMap<>();
        int length = nums.length;
        
        for(int i = 0; i < length; i++){
            values.put(nums[i], values.getOrDefault(nums[i], 0) + 1);
        }

        int n = length / 2;

        for(Map.Entry<Integer, Integer> entry: values.entrySet()){
            if(entry.getValue() > n){
                return entry.getKey();
            }
        }

        return 0;
    }

    /**
     * Boyer-Moore Voting,
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    static int majorityElementWithVoting(int[] nums){
        int candidate = 0;
        int count = 0;
        int length = nums.length;

        for(int i = 0; i < length; i++){
            if(count == 0){
                candidate = nums[i];
            }
            count += (nums[i] == candidate) ? 1 : -1;
        }

        return candidate;
    }

}
