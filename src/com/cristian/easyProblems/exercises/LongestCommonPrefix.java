package com.cristian.easyProblems.exercises;

public class LongestCommonPrefix {


    public static String findLongestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }

        String commonPrefix = strs[0];

        for(int i = 1; i < strs.length - 1; i++){
            while(strs[i].indexOf(commonPrefix) ==  -1){
                commonPrefix = commonPrefix.substring(0, commonPrefix.length()-1);
            }

            if(commonPrefix.length() == 0){
                return "";
            }
        }
        return commonPrefix;
    }

    public static void main (String[] args){
        String[] words = {"flow", "can", "read", "nothing"};
        System.out.println(findLongestCommonPrefix(words));

        String[] words2 = {"flush", "flew", "flow", "fly"};
        System.out.println(findLongestCommonPrefix(words2));
    }
}
