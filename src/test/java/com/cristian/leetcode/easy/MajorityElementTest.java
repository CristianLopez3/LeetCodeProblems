package com.cristian.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MajorityElementTest {

    @Test
    void majorityElementTestCase1(){
        int nums[] = {2,2,1,1,1,2,2};
        int result = MajorityElement.majorityElement(nums);
        int expectedResult = 2;
        assertEquals(expectedResult, result);
    }

    @Test
    void majorityElementTestCase2(){
        int nums[] = {3, 2, 3};
        int result = MajorityElement.majorityElement(nums);
        int expectedResult = 3;
        assertEquals(expectedResult, result);
    }

    @Test
    void majorityElementTestCaseWithVoting1(){
        int nums[] = {2,2,1,1,1,2,2};
        int result = MajorityElement.majorityElementWithVoting(nums);
        int expectedResult = 2;
        assertEquals(expectedResult, result);
    }

    @Test
    void majorityElementTestWithVotingCase2(){
        int nums[] = {3, 2, 3};
        int result = MajorityElement.majorityElementWithVoting(nums);
        int expectedResult = 3;
        assertEquals(expectedResult, result);
    }

}
