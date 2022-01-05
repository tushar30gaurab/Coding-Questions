class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        int left = 0, right = 0;
        int result = 0, n = s.length();
        
        while(right<n){
            if(map.containsKey(s.charAt(right)))
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            
            map.put(s.charAt(right), right);
            
            result = Math.max(result, (right - left + 1));
            right++;
        }
        
        return result;
    }
}