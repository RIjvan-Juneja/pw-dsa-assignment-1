// Leetcode : 35.Search Insert Position
//Pw : **Q3.**
//💡  Given a sorted array of distinct integers and a target value, return the index if the target
//    is found. If not, return the index where it would be if it were inserted in order. You must
//    write an algorithm with O(log n) runtime complexity.

public class SearchInsertPosition {

//    method 1 : O(n)
//    public int searchInsert(int[] nums, int target) {
//        for(int i=0; i<nums.length; i++){
//            if(nums[i] >= target){
//                return i;
//            }
//        }
//        return nums.length;
//    }


    //binary search  O(logn)
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high = nums.length-1;
        int mid;

        while( low <= high){
            mid = low + (high-low)/2;

            if(nums[mid] == target){
                return mid;
            } else if(nums[mid]>target){
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return low;
    }
}
