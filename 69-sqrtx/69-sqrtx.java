class Solution {
    public int mySqrt(int x) {
        long i = x;
        while(i*i>x)
            i = (i + (x/i))/2;
        
        return (int)i;
    }
}