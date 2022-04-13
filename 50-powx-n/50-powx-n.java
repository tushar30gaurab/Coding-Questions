class Solution {
    public double myPow(double x, int n) {
        return pow(x,n);
    }
    
    public double pow(double x, long n){
        double ans = x;

if(n < 0){
 x = 1/x ;
    n*=(-1);
}         // i've checked for negative number // 


if(n==0)
return 1;
if(x==0 || x==1 || n==1)
return x;



if(n%2==0)
ans = pow(x*x,n/2);
else 
ans = pow(x*x,n/2)*x;

return ans ;
    }
}