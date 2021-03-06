class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start=0, end=nums.length-1;
        
        while(start<end){
            if(nums[start]+nums[end] == target){
                return new int[]{start+1, end+1};  //since array was 1-indexed (1,2,3,....)
            }
            else if(nums[start]+nums[end] < target){
                start++;
            }
            else if(nums[start]+nums[end] > target){
                end--;
            }
        }
        
        return new int[]{};
    }
}
