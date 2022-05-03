class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int numscopy[] = nums.clone();
        Arrays.sort(numscopy);
        
        int minm = nums.length;
        int maxm = 0;
        
        for(int i=0; i<nums.length; i++) {
            
            if(nums[i] != numscopy[i]){
                minm = Math.min(minm, i);
                maxm = Math.max(maxm, i);
            }
        }
        
        return (maxm-minm) < 0 ? 0 : maxm - minm + 1;
    }
}