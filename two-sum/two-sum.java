//Solution using ArrayList
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

//Solution using HashMap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            int complement = target - nums[i];
            if(hm.containsKey(complement))
                return new int[]{hm.get(complement), i};
            else
                hm.put(nums[i], i);
            
        }
        
        return new int[]{-1,-1};
        
    }
}
