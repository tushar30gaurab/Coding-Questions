class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min = nums.length, max = 0;
        
        for(int i=0; i<nums.length - 1; i++){
            for(int j=i+1; j<nums.length; j++){
                
                if(nums[j]<nums[i]) {
                min = Math.min(min, i);
                max = Math.max(max, j); 
                }

            }
        }
        
        
        return (max-min <0) ? 0 : max-min+1;
    }
}