class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<nums.length; i++){
            
            int complement = target - nums[i];
            
            if(!list.contains(complement))
                list.add(nums[i]);
            else
                return new int[]{i, list.indexOf(complement)};
        }
        return new int[]{};
    }
}