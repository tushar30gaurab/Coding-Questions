//Iterative Approach
class Solution {
    public boolean isPowerOfTwo(int n) {
        long i,j;
        j=n;
        for(i=0;i<=31;i++)
        {
            if(j==(long)Math.pow(2,i))
                return true;
        }
        return false;
    }
}

//Recursive Approach
class Solution {
    
    public boolean checkPower(int n, int counter){
        if(counter>31){
            return false;
        }
        
        if(n == Math.pow(2,counter))
            return true;
        
        return checkPower(n, counter+1);
    }
    public boolean isPowerOfTwo(int n) {
        int counter = 0;
        boolean result = checkPower(n, counter);
        return result;
    }
}
