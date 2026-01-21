// Leetcode 1

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        for(i=0; i<nums.length; i++){
            for(j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        } 
        return new int[]{};
    }
}

//Leetcode 26
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i=0;
        for(int j=1; j<nums.length; j++){
            if (nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}

