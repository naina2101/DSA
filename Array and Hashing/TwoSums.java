/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.*/

import java.util.*;

public class TwoSums {
    public static void Two_Sums(int[] nums, int target){
        //brute force
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    System.out.println("[" + i + ", " + j + "]");
                }
            }
        }

        //Hash table
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            numMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(numMap.containsKey(complement))
                System.out.println("[" + numMap.get(complement) + ", " + i +"]");
            numMap.put(nums[i], i);
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        Two_Sums(nums, target);
    }
}
