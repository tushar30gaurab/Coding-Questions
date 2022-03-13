class Solution {
    public double myPow(double x, int n) {
        return pow(x,n);
    }
    
    public double pow(double x, long n){
        if(n == 0)
            return 1;
        
        if(n<0)
            return pow(1/x, -n);
        
        if(n%2==0)
            return pow(x*x, n/2);

        return x*pow(x*x, n/2);
    }
}