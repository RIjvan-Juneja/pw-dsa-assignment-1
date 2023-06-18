// leet code : 1. Two Sum
//pw  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//        You can return the answer in any order.
//        **Example:**
//        Input: nums = [2,7,11,15], target = 9
//        Output0 [0,1]
//        **Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1]


import java.util.*;
public class findTarget {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
        //fill index in hashmap
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],i);
        }

        //Searching
        for(int i=0; i<nums.length; i++){
            int x= nums[i];
            int rem=target-x;   //remaining

            if (map.containsKey(rem)){
                int index =map.get(rem);
                if(index==i)continue;
                return new int[]{i,index};
            }
        }
        return new int[]{};
    }
}
