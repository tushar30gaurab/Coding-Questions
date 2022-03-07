import java.util.HashSet;
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        if(words.length== 0) // corner case check
            return 0;
        
        
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        
        for(int i=0; i<allowed.length(); i++){
            hs.add(allowed.charAt(i));
        }
        
        for(int i=0; i<words.length; i++){
            boolean flag = false;
            for(int j=0; j<words[i].length(); j++){
                if(hs.contains(words[i].charAt(j))){
                    flag = true;
                }
                    
                else{
                    // flag = true;
                    flag = false;
                    break;
                }
                    
            }
            
            if(flag == true){
                count++;
            }
            // else{
            //     count--;
            // }
                
        }
        
        return count;
    }
}