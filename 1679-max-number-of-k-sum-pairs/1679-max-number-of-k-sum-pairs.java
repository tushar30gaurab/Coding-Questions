class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        
        int start = 0, end = nums.length - 1;
        int count=0;
        while(start<end){
            if(nums[start] + nums[end] == k){
                count++;
                start++;
                end--;
            }
            
            else if(nums[start] + nums[end] < k ){
                start++;
            }
            
            else if(nums[start] + nums[end] >k ){
                end--;
            }
        }
        
        return count;
    }
}