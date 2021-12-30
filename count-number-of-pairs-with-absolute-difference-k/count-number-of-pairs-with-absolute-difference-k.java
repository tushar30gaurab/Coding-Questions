// O(n^2) solution - Brute Force Method
class Solution {
    public int countKDifference(int[] nums, int k) {
        
        int count=0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                int diff = Math.abs(nums[i]-nums[j]);
                if(diff == k)
                    count++;
            }
        }
        return count;
    }
}


// O(N) Solution - Count Sort Technique
class Solution {
    public int countKDifference(int[] nums, int k) {
        
        int count=0;
        int n = nums.length;
        int arr[] = new int[201]; //taking advantage of leetcode constraint
        
        for(int i=0; i<n;i++){
            arr[nums[i]]++;
        }
        
        for(int i=k+1; i<201; i++){
            count += arr[i]*arr[i-k]; // main step - pay attention!
        }
        
        return count;
    }
}


//O(N) Solution - using HashMap
class Solution {
    public int countKDifference(int[] nums, int k) {
        
        int count=0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            
            if(map.containsKey(nums[i]+k)){
                count += map.get(nums[i]+k);
            }
            if(map.containsKey(nums[i]-k)){
                count += map.get(nums[i]-k);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        return count;
    }
}
