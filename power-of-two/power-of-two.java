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