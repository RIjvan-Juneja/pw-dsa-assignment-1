//Leetcode : 217 Contains Duplicate
//pw :**Q6.**
//        Given an integer array nums, return true if any value appears at least twice in the array, and return false if
//        every element is distinct.
//
//        **Example 1:**
//        Input: nums = [1,2,3,1]
//        Output: true

public class ContainsDuplicate {

    // time complexity : O(n)
    // space complexity : O(n)
    public boolean containsDuplicate(int[] nums) {
        //Create hashset to store integers
        Set<Integer> hs= new HashSet<>();

        for(int i =0; i<nums.length; i++){

            // check element is alredy present then return true
            if(hs.contains(nums[i])) return true;

            // if not present then add in hashset
            hs.add(nums[i]);
        }

        // if all array trawsed its meand no dublicate
        return false;
    }
}
