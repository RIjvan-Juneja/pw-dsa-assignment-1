//Leetcode : 645.Set Mismatch
//pw :**Q8.**
//        You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some
//        error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one
//        number and loss of another number.
//        You are given an integer array nums representing the data status of this set after the error.
//        Find the number that occurs twice and the number that is missing and return them in the form of an array.
//
//        **Example 1:**
//        Input: nums = [1,2,2,4]
//        Output: [2,3]

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
// create an array in which the value of the cell with index n is equal to the number of repetitions n in the nums array
        var numsOfRepeat = new int[nums.length+1];
        var result = new int[2];
        int missNum = 0;

        for (int i = 0; i < nums.length; i++){
            missNum = missNum + (i+1);  // sum all numbers from 1 to n
            numsOfRepeat[nums[i]]+=1; // increase the number of repetitions n
            if (numsOfRepeat[nums[i]] == 2){  // check if n is a duplicate
                result[0] = nums[i];
            } else {
                missNum-=nums[i]; // subtract from the sum from 1 to n each non-repeating element
            }
        }

        result[1] = missNum;
        return result;
    }
}
