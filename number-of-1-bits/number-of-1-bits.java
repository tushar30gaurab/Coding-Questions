// Approach 1
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            count+=(n&1);
            n = n>>>1;
        }
        
        return count;
    }
}


//Approach 2
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        int count = 0;
        for(int i=0;i<32;i++){
            count += (n>>i & 1) == 1 ? 1 : 0;
        }
        return count;
    }
}
